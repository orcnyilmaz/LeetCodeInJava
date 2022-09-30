package easy;

public class SearchInsertPosition {

    // https://leetcode.com/problems/search-insert-position/

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        System.out.println(searchInsert(nums, 5));

        int[] nums2 = new int[] {1,3,5,6};
        System.out.println(searchInsert(nums2, 2));

        int[] nums3 = new int[] {1,3,5,6};
        System.out.println(searchInsert(nums3, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }

        return nums.length;
    }
}
