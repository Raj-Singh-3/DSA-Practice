// https://leetcode.com/problems/middle-of-the-linked-list/
//Given the head of a singly linked list, return the middle node of the linked list.If there are two middle nodes, return the second middle node.

public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
