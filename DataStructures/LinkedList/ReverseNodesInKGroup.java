// https://leetcode.com/problems/reverse-nodes-in-k-group/description/

// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// You may not alter the values in the list's nodes, only nodes themselves may be changed.

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode prev = null, nextNode = null, temp = head;
        while(temp!=null)
        {
            ListNode kthNode = findKthListNode(temp, k);
            if(kthNode == null)
            {
                if(prev!=null) prev.next = temp;
                break;
            }
            nextNode= kthNode.next;
            kthNode.next = null;
            kthNode = reverse(temp);
            if(temp == head)
            {
                head = kthNode;
            }
            else
            {
                prev.next = kthNode;
            }
            prev = temp;
            temp = nextNode;

        }
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
    public ListNode reverse(ListNode head)
    {
        if(head == null|| head.next == null) return head; 
        ListNode prev = null;
        ListNode curr = head;
        ListNode front = head.next;
        // 1 -> 2 -> 4 -> 6 -> 87 -> null
        // null <- 1 <- 2 <- 4 <- 6 <- 87

        while(front!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = front;
            front = front.next;
        }
        curr.next = prev;
        return curr;
    }
}
