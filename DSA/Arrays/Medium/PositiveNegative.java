package DSA.Arrays.Medium;

public class PositiveNegative {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;  // Increment by 2 to place the next negative number at the next alternate position
            } else {
                ans[pos] = nums[i];
                pos += 2;  // Increment by 2 to place the next positive number at the next alternate position
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        PositiveNegative solution = new PositiveNegative();
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] rearrangedArray = solution.rearrangeArray(nums);
        System.out.println("Rearranged array: " + java.util.Arrays.toString(rearrangedArray));
        // Output should be [3, -2, 1, -5, 2, -4]
    }
}
