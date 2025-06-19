// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

// 1 -> 1 -> 2 -> 3-> 3 -> 4-> null
// 1 -> 2 ->3 -> null
public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode prev = new ListNode(-1);
        head = prev;
        while(temp!=null)
        {
            ListNode temp1 = head.next;
            while(temp1 != null && temp1.val == temp.val)
            {
                temp1 = temp1.next;
            }
            if(temp == head && temp.val != temp1.val)
            {
                head = temp1;
                temp = head;
            }
            else if(temp != head && temp.val != temp.val)
            {
                prev.next = temp;
                temp = temp1;
            }
            temp = temp.next;
        }
        
    }
}
