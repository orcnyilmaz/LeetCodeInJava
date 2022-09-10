package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        int[] testArray = new int[] {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(testArray, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int iterator = 0; iterator < nums.length; iterator++) {
            if (resultMap.containsKey(nums[iterator])) {
                int left = resultMap.get(nums[iterator]);
                return new int[] { left, iterator };
            } else {
                resultMap.put(target - nums[iterator], iterator);
            }
        }
        return new int[2];
    }
}
