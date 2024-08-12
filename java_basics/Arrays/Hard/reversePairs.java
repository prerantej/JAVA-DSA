package java_basics.Arrays.Hard;

import java.util.Arrays;

class reversePairs {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] nums, int l, int h) {
        int count = 0;
        if (l < h) {
            int mid = l + (h - l) / 2;
            count += mergeSort(nums, l, mid);
            count += mergeSort(nums, mid + 1, h);
            count += merge(nums, l, mid, h);
        }
        return count;
    }

    public int merge(int[] nums, int l, int mid, int h) {
        int count = 0;
        int[] left = Arrays.copyOfRange(nums, l, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, h + 1);

        int i = 0;
        int j = 0;
        int k = l;

        // Count reverse pairs
        for (i = 0; i < left.length; i++) {
            while (j < right.length && left[i] > 2L * right[j]) {
                j++;
            }
            count += j;
        }

        // Merge two sorted arrays
        i = 0;
        j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while (i < left.length) {
            nums[k++] = left[i++];
        }

        while (j < right.length) {
            nums[k++] = right[j++];
        }

        return count;
    }

    public static void main(String[] args) {
        reversePairs rp = new reversePairs();
        int[] nums = {1, 3, 2, 3, 1};  // Example input
        int result = rp.reversePairs(nums);
        System.out.println("Number of reverse pairs: " + result);
    }
}

