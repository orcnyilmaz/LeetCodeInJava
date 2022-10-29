package easy;

import util.ListNode;

import static util.ListNode.generateListNodes;
import static util.ListNode.reverse;

public class PalindromeLinkedList {

    // https://leetcode.com/problems/palindrome-linked-list/
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,2,1};
        System.out.println(isPalindrome(generateListNodes(nums1)));
        int[] nums2 = new int[] {1,2};
        System.out.println(isPalindrome(generateListNodes(nums2)));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode middleIndex = head;
        ListNode lastIndex = head;

        while(lastIndex != null && lastIndex.next != null) {
            lastIndex = lastIndex.next.next;
            middleIndex = middleIndex.next;
        }

        lastIndex = head;
        middleIndex = reverse(middleIndex);

        while(lastIndex != null && lastIndex.next != null) {
            if (middleIndex.val != lastIndex.val) {
                return false;
            }
            middleIndex = middleIndex.next;
            lastIndex = lastIndex.next;
        }

        return true;
    }
}
