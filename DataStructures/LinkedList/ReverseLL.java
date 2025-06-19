public class ReverseLL {
    public Node reverse(Node head)
    {
        if(head == null|| head.next == null) return head; 
        Node prev = null;
        Node curr = head;
        Node front = head.next;
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
