package medium;

public class JumpGame {

    // https://leetcode.com/problems/jump-game/
    public static void main(String[] args) {
        int[] nums = new int[] {2,3,1,1,4};
        System.out.println(canJump(nums)); // true

        int[] nums2 = new int[] {3,2,1,0,4};
        System.out.println(canJump(nums2)); // false

        int[] nums3 = new int[] {2,0,0,0,5,6,3,1};
        System.out.println(canJump(nums3)); // false

        int[] nums4 = new int[] {0};
        System.out.println(canJump(nums4)); // true

        int[] nums5 = new int[] {0,1};
        System.out.println(canJump(nums5)); // false

        int[] nums6 = new int[] {2,0,0};
        System.out.println(canJump(nums6)); // true
    }

    public static boolean canJump(int[] nums) {
        int length = nums.length;
        if (length == 1) return true;
        if (nums[0] == 0) return false;
        int step = 0;

        for (int i = length - 1; i >= 0; i--) {
            if (step > 0) {
                if (nums[i] > step || (nums[i] >= step && i + step == length - 1)) {

                    step = 0;
                }
            }
            if (nums[i] == 0 || step != 0) {
                step++;
            }
        }

        return step == 0;
    }
}
