package java_basics.Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

class MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int count1 = 0;
        int count2 = 0;
        int el1 = 0;
        int el2 = 0;

        // First pass to find potential candidates
        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != el2) {
                count1 = 1;
                el1 = nums[i];
            } else if (count2 == 0 && nums[i] != el1) {
                count2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                count1++;
            } else if (nums[i] == el2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass to confirm the candidates
        int threshold = n / 3;
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (el1 == nums[i]) {
                count1++;
            } else if (el2 == nums[i]) {
                count2++;
            }
        }

        if (count1 > threshold) {
            ans.add(el1);
        }
        if (count2 > threshold) {
            ans.add(el2);
        }

        return ans;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4}; // Example input
        List<Integer> result = me.majorityElement(nums);

        System.out.println("Majority elements are:");
        for (Integer num : result) {
            System.out.println(num);
        }
    }
}
