package easy;

public class MaximumDifferenceBetweenIncreasingElements {

    // https://leetcode.com/problems/maximum-difference-between-increasing-elements/
    public static void main(String[] args) {
        int[] nums = new int[] {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != nums[i] && nums[j] - nums[i] > result) {
                    result = nums[j] - nums[i];
                }
            }
        }

        return result;
    }
}
