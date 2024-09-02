package DSA.Arrays.Medium;

class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = nums[0];
        int count = 1;

        // Finding the candidate for majority element using Boyer-Moore Voting Algorithm
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                ele = nums[i];
                count = 1;
            } else if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        // Verification step to check if the candidate is actually the majority element
        count = 0;
        for (int num : nums) {
            if (num == ele) {
                count++;
            }
        }

        if (count > n / 2) {
            return ele;
        }

        return -1; // If there's no majority element
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        // Test case 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Majority element in nums1: " + solution.majorityElement(nums1));

        // Test case 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element in nums2: " + solution.majorityElement(nums2));

        // Test case 3
        int[] nums3 = {1, 2, 3, 4};
        System.out.println("Majority element in nums3: " + solution.majorityElement(nums3));
    }
}
