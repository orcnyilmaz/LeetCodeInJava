package easy;

public class AddTwoNumbers {


    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    // https://leetcode.com/problems/add-two-numbers/
    public static void main(String[] args) {

    }

    // 2 -> 4 -> 3
    // 5 -> 6 -> 4
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
