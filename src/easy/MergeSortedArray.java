package easy;

public class MergeSortedArray {

    // https://leetcode.com/problems/merge-sorted-array/

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        merge(nums1, 3, nums2, 3);

        int[] nums3 = new int[] {2,0};
        int[] nums4 = new int[] {1};
        merge(nums3, 1, nums4, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while(p2 >=0 ){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1 = p1 - 1;
            }
            else{
                nums1[i] = nums2[p2];
                p2 = p2 - 1;
            }

            i = i - 1;
        }
    }
}
