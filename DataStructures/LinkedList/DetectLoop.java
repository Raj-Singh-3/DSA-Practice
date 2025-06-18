// https://leetcode.com/problems/linked-list-cycle/
//Given head, the head of a linked list, determine if the linked list has a cycle in it. There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.

import java.util.HashSet;

public class DetectLoop {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                return true;
            } 
        }
        return false;
    }






   // https://leetcode.com/problems/linked-list-cycle-ii/

    //    Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

    // There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

    // Do not modify the linked list.Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.


    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        HashSet<ListNode> ht = new HashSet<>();
        ListNode temp = head;
        while(temp!=null)
        {
            if(ht.contains(temp)) return temp;
            ht.add(temp);
            temp = temp.next;
        }
        return null;
    }

}
