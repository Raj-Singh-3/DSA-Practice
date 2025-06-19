// https://leetcode.com/problems/rotate-list/
// Given the head of a linked list, rotate the list to the right by k places.

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode tail = head;
        int c = 0;
        while(temp!=null)
        {
            c++;
            tail = temp;
            temp = temp.next;
        }
        k = k%c;
        if(k == 0) return head;
        tail.next = head;
        temp = head;
        ListNode newNode = findKthListNode(temp, c-k);
        head = newNode.next;
        newNode.next = null;
        return head;

    }

    public ListNode findKthListNode(ListNode temp, int k)
    {
        ListNode t = temp;
        while(k!=1 && t != null)
        {
            k--;
            t = t.next;
        }
        return t;
    }
}
