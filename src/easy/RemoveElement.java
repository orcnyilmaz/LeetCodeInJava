package easy;

public class RemoveElement {

    // https://leetcode.com/problems/remove-element/
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        System.out.println(removeElement(nums, 3));

        int[] nums2 = new int[] {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums2, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[resultIndex] = nums[i];
                resultIndex++;
            }
        }

        return resultIndex;
    }
}
