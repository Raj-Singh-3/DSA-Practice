// https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1
// Given an array arr[] of n sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list, then return the head of the merged linked list.
import java.util.*;

public class MergeKSortedList {
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        for(Node n: arr)
        {
            if(n!=null) pq.offer(n);
        }
        Node dummyNode = new Node(0);
        Node curr = dummyNode;
        while(!pq.isEmpty())
        {
            Node small = pq.poll();
            curr.next = small;
            curr = curr.next;
            if(small.next != null) pq.offer(small.next);
        }
        return dummyNode.next;
        
    }
}
