package java_basics.Arrays.Medium;

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            rev(0, n - 1, nums);
        } else {
            for (int i = n - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    swap(i, ind, nums);
                    break;
                }
            }

            rev(ind + 1, n - 1, nums);
        }
    }

    public void swap(int x, int y, int[] arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void rev(int x, int y, int[] arr) {
        int n=arr.length;
        int i = x;
        int j = y;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        NextPermutation solution = new NextPermutation();
        int[] nums = {1, 2, 3};
        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        solution.nextPermutation(nums);
        System.out.println("Next permutation: " + java.util.Arrays.toString(nums));
    }
}