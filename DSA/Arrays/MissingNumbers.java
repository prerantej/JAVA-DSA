package DSA.Arrays;

public class MissingNumbers {
    public int missingNumber(int[] nums) {
        int numsLength = nums.length;
        int i = 0;

        while (i < numsLength) {
            int valAtI = nums[i];
            boolean belongsInRange = valAtI < numsLength;

            if (belongsInRange && valAtI != nums[valAtI]) {
                // Swap nums[i] with nums[valAtI]
                int temp = nums[i];
                nums[i] = nums[valAtI];
                nums[valAtI] = temp;
            } else {
                i++;
            }
        }

        for (int x = 0; x < numsLength; x++) {
            if (x != nums[x]) {
                return x;
            }
        }

        return numsLength;
    }

    public static void main(String[] args) {
        MissingNumbers solution = new MissingNumbers();

        // Test cases
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number in [3, 0, 1]: " + solution.missingNumber(nums1)); // Output: 2

        int[] nums2 = {0, 1};
        System.out.println("Missing number in [0, 1]: " + solution.missingNumber(nums2)); // Output: 2

        int[] nums3 = {0};
        System.out.println("Missing number in [0]: " + solution.missingNumber(nums3)); // Output: 1
    }
}
