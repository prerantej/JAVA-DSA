package java_basics.Arrays;
import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        // Test case
        int[] nums = {1, 1, 2};
        int newLength = solution.removeDuplicates(nums);

        // Print the result
        System.out.println("New length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
