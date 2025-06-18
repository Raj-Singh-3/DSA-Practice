// https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

//Given a head singly linked list of positive integers. The task is to check if the given linked list is palindrome or not.


public class PalindromeLL {
    static boolean isPalindrome(Node head) {
        if(head == null || head.next == null) return true;
        // Your code here
        Node slow = head;
        Node fast = head;
        // Find the middle of the list
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverse(slow.next);
        Node first = head, second = newHead;
        boolean res = true;
        while(second != null) {
            if(first.val != second.val) {
                res = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        // Restore the original list
        slow.next = reverse(newHead);
        return res;        
    }
    
    static Node reverse(Node k) {
        if(k == null || k.next == null) return k;
        Node prev = null;
        Node curr = k;
        Node front = k.next;
        while(front != null) {
            curr.next = prev;
            prev = curr;
            curr = front;
            front = front.next;
        }
        curr.next = prev;
        return curr;
    }
}
