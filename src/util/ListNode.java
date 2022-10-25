package util;

//Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode generateListNode(int[] nums) {
        ListNode node1 = new ListNode();
        ListNode nodeTemp = new ListNode(nums[0]);

        node1.next = nodeTemp;

        for (int i = 1; i < nums.length; i++) {
            nodeTemp.next = new ListNode(nums[i]);
            nodeTemp = nodeTemp.next;
        }

        return node1.next;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
