// https://leetcode.com/problems/sort-list/
// Given the head of a linked list, return the list after sorting it in ascending order.

public class SortLinkedList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Cut the list into two halves
        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return mergeTwoLists(left, right);

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode t1 = list1, t2 = list2;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(t1 != null && t2!=null)
        {
            if(t1.val<t2.val)
            {
                temp.next = t1;
                temp = t1;
                t1 = t1.next; 
            }
            else
            {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;    
            }
        }
        if(t1!=null) temp.next = t1;
        if(t2!=null) temp.next = t2;
        return dummyNode.next;
        
    }
}
