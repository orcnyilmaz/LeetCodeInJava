package easy;

import util.ListNode;

public class LinkedListCycle {

    // https://leetcode.com/problems/linked-list-cycle/
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,0,-4};
        System.out.println(hasCycle(ListNode.generateListNodes(nums)));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
