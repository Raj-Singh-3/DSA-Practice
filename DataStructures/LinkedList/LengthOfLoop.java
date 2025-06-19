// https://www.geeksforgeeks.org/problems/find-length-of-loop/1

// Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.

// Note: 'c' is the position of the node which is the next pointer of the last node of the linkedlist. If c is 0, then there is no loop
public class LengthOfLoop {
    public int countNodesinLoop(Node head) {
        // code here.
        if(head == null || head.next == null) return 0;
        Node slow = head;
        Node fast = head;
        int length = 0;
        int flag = 0;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                flag = 1;
                break;
            } 
        } 
        if(flag == 0) return 0;
        fast = fast.next;
        length += 1;
        while(slow!=fast)
        {
            fast = fast.next;
            length += 1;
        }
        return length;
    }
}