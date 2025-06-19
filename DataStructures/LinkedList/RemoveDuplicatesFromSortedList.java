// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp!=null)
        {
            ListNode temp1 = temp.next;
            while(temp1!= null && temp1.val == temp.val)
            {
                temp1 = temp1.next;
            }
            temp.next = temp1;
            temp = temp.next;
        }
        return head;
    }
}
