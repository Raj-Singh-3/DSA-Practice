// https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/0

// Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value target.

import java.util.ArrayList;

public class FindPairsWithGivenSum {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        if(head == null || head.next == null)
        {
            return arr;
        }
        // given that it is sorted LL so we use two pointer approach.
        Node left = head; // points to lhs.
        Node right = head; // points to rhs
        while(right.next!=null)
        {
            right = right.next;
        }
        while (left != null && right != null && left != right && left.prev != right)
        {
            ArrayList<Integer> brr = new ArrayList<>();
            if(left.val+right.val == target)
            {
                brr.add(left.val);
                brr.add(right.val);
                arr.add(brr);
                left = left.next;
                right = right.prev;
            }
            else if(left.val+right.val<target)
            {
                left = left.next;
            }
            else
            {
                right = right.prev;
            }
        }
        return arr;

        
    }
}
