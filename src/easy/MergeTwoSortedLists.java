package easy;

import generics.ListNode;

public class MergeTwoSortedLists {

    // https://leetcode.com/problems/merge-two-sorted-lists/

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,4};
        int[] nums2 = new int[] {1,3,4};
        ListNode node1 = generateListNode(nums1);
        ListNode node2 = generateListNode(nums2);

        ListNode resultNode = mergeTwoLists(node1, node2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0);
        ListNode head = tempNode;

        while(list1 != null || list2 != null) {
            if (list1 == null) {
                tempNode.next = list2;
                break;
            }

            if (list2 == null) {
                tempNode.next = list1;
                break;
            }

            if (list1.val < list2.val) {
                tempNode.next = list1;
                list1 = list1.next;
            } else {
                tempNode.next = list2;
                list2 = list2.next;
            }

            tempNode = tempNode.next;
        }

        return head.next;
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
}


