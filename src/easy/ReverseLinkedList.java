package easy;

import util.ListNode;

public class ReverseLinkedList {

    // https://leetcode.com/problems/reverse-linked-list/
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        reverseList(ListNode.generateListNodes(nums));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
