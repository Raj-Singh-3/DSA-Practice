// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

//Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0;i<n;i++)
        {
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;

    }
}
