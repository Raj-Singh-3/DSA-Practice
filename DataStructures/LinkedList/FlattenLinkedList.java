// https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1
// Given a linked list containing n head nodes where every node in the linked list contains two pointers:
// (i) next points to the next node in the list.
// (ii) bottom pointer to a sub-linked list where the current node is the head.
// Each of the sub-linked lists nodes and the head nodes are sorted in ascending order based on their data.
// Your task is to flatten the linked list such that all the nodes appear in a single level while maintaining the sorted order.

// Note:
// 1. ↓ represents the bottom pointer and -> represents the next pointer.
// 2. The flattened list will be printed using the bottom pointer instead of the next pointer.

class Node{
    Node next;
    Node bottom;
    int data;
    public Node(int data)
    {
        this.data = data;
        this.bottom = null;
        this.next = null;
    }
}
public class FlattenLinkedList {
    Node flatten(Node root) {
        // code here
        if(root == null||root.next == null) return root;

        Node mergeHead = flatten(root.next);
        return mergeTwoLists(root, mergeHead); 
    }

    public Node mergeTwoLists(Node list1, Node list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        Node t1 = list1, t2 = list2;
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(t1 != null && t2!=null)
        {
            if(t1.data<t2.data)
            {
                temp.bottom = t1;
                temp = t1;
                t1 = t1.bottom; 
            }
            else
            {
                temp.bottom = t2;
                temp = t2;
                t2 = t2.bottom;    
            }
            temp.next = null;
        }
        if(t1!=null) temp.bottom = t1;
        if(t2!=null) temp.bottom = t2;
        if(dummyNode.bottom != null)dummyNode.bottom.next = null;
        return dummyNode.bottom;
        
    }
    
}
