// https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1
// You are given the head_ref of a doubly Linked List and a Key. Your task is to delete all occurrences of the given key if it is present and return the new DLL.

public class DeleteAllOccurenceOfK
{
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        Node prevNode = temp.prev;
        Node nextNode = temp.next;
        while(temp!=null)
        {
            if(temp.val == x)
            {
                if(temp == head)
                {
                    head = head.next;
                }
                prevNode = temp.prev;
                nextNode = temp.next;
                if(prevNode!=null) prevNode.next = nextNode;
                if(nextNode!=null) nextNode.prev = prevNode;
            }
            temp = temp.next;
        }
        return head;
        
    }
}