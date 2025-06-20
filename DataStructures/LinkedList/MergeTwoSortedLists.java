// https://leetcode.com/problems/merge-two-sorted-lists/
// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

public class MergeTwoSortedLists {
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
