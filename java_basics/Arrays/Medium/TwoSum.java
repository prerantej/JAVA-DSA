package java_basics.Arrays.Medium;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        arr[0] = arr[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int needed = target - x;
            if (mpp.containsKey(needed)) {
                arr[0] = mpp.get(needed);
                arr[1] = i;
                return arr;
            }
            mpp.put(nums[i], i);
        }
        return arr;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
