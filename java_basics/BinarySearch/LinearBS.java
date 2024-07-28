package java_basics.BinarySearch;
import java.util.Arrays;

public class LinearBS {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearBS solution = new LinearBS();
        int[] nums = {4, 2, 7, 1, 3, 6, 5};
        int target = 3;
        int result = solution.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}
