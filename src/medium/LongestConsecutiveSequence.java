package medium;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    // https://leetcode.com/problems/longest-consecutive-sequence/
    public static void main(String[] args) {
        int[] nums = new int[] {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
        int[] nums2 = new int[] {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums2));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numsSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        int longestStreak = 1;

        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int currentNum = num;
                int localStreak = 1;

                while(numsSet.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    localStreak++;

                    if (localStreak > longestStreak) {
                        longestStreak = localStreak;
                    }
                }
            }
        }

        return longestStreak;
    }
}
