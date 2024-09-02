package DSA.BinarySearch;

public class noOfOccurrences {
    public int count(int[] arr, int n, int x) {
        int left = binarySearch(arr, x, true);
        int right = binarySearch(arr, x, false);
        if (left == -1 || right == -1) {
            return 0;
        }
        return right - left + 1;
    }

    private int binarySearch(int[] nums, int x, boolean isleft) {
        int l = 0;
        int h = nums.length - 1;
        int index = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] < x) {
                l = mid + 1;
            } else if (nums[mid] > x) {
                h = mid - 1;
            } else {
                index = mid;
                if (isleft) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        noOfOccurrences solution = new noOfOccurrences();

        int[] arr = {1, 2, 2, 2, 3, 4, 5}; // Example sorted array
        int x = 2; // Number to count occurrences of
        int n = arr.length; // Length of the array

        int result = solution.count(arr, n, x);
        System.out.println("Occurrences of " + x + ": " + result);
    }
}
