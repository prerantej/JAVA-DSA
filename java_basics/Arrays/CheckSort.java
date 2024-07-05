package java_basics.Arrays;

public class CheckSort {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }

        if (nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        CheckSort cs = new CheckSort();

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 3, 4, 5, 1};
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {2, 1, 3, 4, 5};

        System.out.println("Is nums1 sorted (or can be made sorted by one rotation)?: " + cs.check(nums1)); // true
        System.out.println("Is nums2 sorted (or can be made sorted by one rotation)?: " + cs.check(nums2)); // true
        System.out.println("Is nums3 sorted (or can be made sorted by one rotation)?: " + cs.check(nums3)); // true
        System.out.println("Is nums4 sorted (or can be made sorted by one rotation)?: " + cs.check(nums4)); // false
    }
}
