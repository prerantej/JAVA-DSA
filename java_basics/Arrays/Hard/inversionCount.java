package java_basics.Arrays.Hard;

import java.util.Arrays;

class inversionCount {
    // Function to count inversions in the array.
    static long inversionCount(long arr[], int n) {
        return mergeSort(arr, 0, n - 1);
    }

    static long mergeSort(long[] arr, int l, int h) {
        long count = 0;
        if (l < h) {
            int mid = l + (h - l) / 2;  // Correctly calculate mid

            count += mergeSort(arr, l, mid);
            count += mergeSort(arr, mid + 1, h);
            count += merge(arr, l, mid, h);
        }
        return count;
    }

    static long merge(long[] arr, int l, int mid, int h) {
        long count = 0;
        long[] left = Arrays.copyOfRange(arr, l, mid + 1);
        long[] right = Arrays.copyOfRange(arr, mid + 1, h + 1);  // Include h + 1

        int i = 0, j = 0, k = l;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += (mid + 1) - (l + i);  // Count inversions
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return count;
    }

    public static void main(String[] args) {
        long[] arr = {2, 3, 8, 6, 1};  // Example input
        int n = arr.length;
        System.out.println("Number of inversions: " + inversionCount(arr, n));
    }
}

