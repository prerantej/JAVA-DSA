package java_basics.BinarySearch;

public class rotatedArraySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[low] <= nums[mid]) {
                // Left half is sorted
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right half is sorted
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        rotatedArraySearch solution = new rotatedArraySearch();

        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Example rotated sorted array
        int target = 0; // Number to search for

        int result = solution.search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}
