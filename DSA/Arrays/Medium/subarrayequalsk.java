package DSA.Arrays.Medium;
import java.util.HashMap;

public class subarrayequalsk {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int sum = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            int req = sum - k;
            c = c + mpp.getOrDefault(req, 0);
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return c;
    }

    public static void main(String[] args) {
        subarrayequalsk solution = new subarrayequalsk();
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println("Number of subarrays with sum " + k + ": " + solution.subarraySum(nums, k)); // Output should be 2
    }
}
