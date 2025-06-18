// https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
// Given a doubly linked list. Your task is to reverse the doubly linked list and return its head.
class Node{
    int val;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.val = data;
        this.next = null;
        this.prev = null;
    }
}
public class ReverseDoublyLL {
    public static void main(String[] args) {
        
    }
    public Node reverseDLL(Node head) {
        // Your code here
        if(head == null || head.next == null) // if single lement then also return head.
        {
            return head;
        }
        Node temp = head;
        Node x = null;
        while(temp!=null)
        {
            Node prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            
            x = temp;
            temp = temp.prev;
        }
        return x;
    } 
}
