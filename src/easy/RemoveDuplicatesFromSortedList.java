package easy;

import util.ListNode;

import static util.ListNode.generateListNodes;

public class RemoveDuplicatesFromSortedList {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public static void main(String[] args) {
        int[] list1 = new int[] {1,1,2,3,3};
        ListNode node1 = generateListNodes(list1);
        //deleteDuplicates(node1);

        int[] list2 = new int[] {1,1,2};
        ListNode node2 = generateListNodes(list2);
        deleteDuplicates(node2);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode firstIndex = head;
        ListNode secondIndex = head.next;
        ListNode resultNode = new ListNode();
        ListNode tempNode = new ListNode(head.val);

        resultNode.next = tempNode;

        while (head.next != null) {
            if (firstIndex.val != secondIndex.val) {
                tempNode.next = new ListNode(secondIndex.val);
                tempNode = tempNode.next;
            }
            firstIndex = secondIndex;
            secondIndex = secondIndex.next;
            head = head.next;
        }

        return resultNode.next;
    }
}
