package medium;

import util.ListNode;

public class AddTwoNumbers {
    // https://leetcode.com/problems/add-two-numbers/
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node11 = new ListNode(4);
        ListNode node111 = new ListNode(3);

        node1.next = node11;
        node11.next = node111;

        ListNode node2 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node222 = new ListNode(4);

        node2.next = node22;
        node22.next = node222;

        addTwoNumbers(node1, node2);
    }

    // 2 -> 4 -> 3
    // 5 -> 6 -> 4
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode tempNode = resultNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry = carry + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                carry = carry + l2.val;
                l2 = l2.next;
            }

            tempNode.next = new ListNode(carry % 10); // 7 -> 0 > 8
            carry = carry / 10; // 0 -> 1 -> 0
            tempNode = tempNode.next;
        }

        return resultNode.next;
    }
}
