package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {

    // https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));

        int[] nums2 = new int[] {0,1};
        System.out.println(missingNumber(nums2));
    }

    // Good at memory but bad at runtime
    /*public static int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int result = 0;
        List<Integer> numList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            if (!numList.contains(i)) {
                return i;
            }
        }

        return result;
    }*/

    // Basic math problem. sum should be = (n * n + 1) / 2
    // Better at both runtime and memory
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (len * (len+1)) / 2;
        for (int num : nums)
            sum -= num;
        return sum;
    }
}