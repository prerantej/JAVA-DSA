package java_basics.Arrays.Medium;

class Kadane {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Kadane solution = new Kadane();

        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum sum of subarray in nums1: " + solution.maxSubArray(nums1));

        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("Maximum sum of subarray in nums2: " + solution.maxSubArray(nums2));

        // Test case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        System.out.println("Maximum sum of subarray in nums3: " + solution.maxSubArray(nums3));
    }
}
