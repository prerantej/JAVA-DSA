package DSA.Arrays.Medium;

import java.util.HashSet;
import java.util.Set;

class LongestSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int curnum = num;
                int curstreak = 1;

                while (numSet.contains(curnum + 1)) {
                    curnum++;
                    curstreak++;
                }

                longestStreak = Math.max(longestStreak, curstreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        LongestSequence solution = new LongestSequence();
        int[] testArray = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(testArray));
    }
}
