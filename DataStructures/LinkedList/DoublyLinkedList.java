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

public class DoublyLinkedList
{
    // arr[] = [2,3,4,5,6]
    // nodes =   null<-2 -><- 3 -><- 4 -><- 5 -><- 6 -> null.
    static Node convertArrayToList(int arr[])
    {
        Node head = new Node(arr[0]);//2 ->null
        head.prev = null;
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]); // 3 will created
            temp.prev = prev; // 2<-3
            prev.next = temp; //2-><-3
            prev = prev.next;
        }
        return head;

    }

    static void traversal(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void reverseTraversal(Node head)
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    // Initially nodes =   null<-2 -><- 3 -><- 4 -><- 5 -><- 6 -> null.
    // null <-3 -><- 4 -><- 5....
    static Node deleteHeadNode(Node head)
    {
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next; // head node  = 3
        prev.next = null; // null<- 2 ->null
        head.prev = null; // null<- 3 -><- 4....
        return head;
    }

    // Initially nodes =   null<-2 -><- 3 -><- 4 -><- 5 -><- 6 -> null.
    // null <- 3 -><- 4 -><- 5 -> null.
    static Node deleteTailNode(Node head)
    {
        if(head == null || head.next == null) return null;
        Node prev = head;
        
        while(prev.next.next !=null)
        {
            prev = prev.next;
        }
        Node temp = prev.next; // temp = 6
        temp.prev = null; // null<- 6 -> null
        prev.next = null; // ...<- 5 ->null (making 5's next value to null)
        return head;
    }

    static Node deleteKthNode(Node head , int k)
    {
        if(head == null || head.next == null ) 
        {
            if(k == 1) return head;
            return null;
        }
        if(k == 1)
        {
            Node prev = head;
            head = head.next; 
            prev.next = null;
            head.prev = null; 
            return head;
        }
        Node temp = head;
        int c = 0;
        while(temp!=null)
        {
            c++;
            if(c == k)
            {
                Node previous= temp.prev; 
                // when k is my last index.
                if(temp.next == null)
                {
                    temp.prev = null;
                    previous.next = null;
                    break;
                }               
                previous.next = temp.next;
                temp.next.prev = previous;
                temp.next = null;
                temp.prev = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }


    static void delete(Node temp)
    {
        Node prev = temp.prev;
        Node front = temp.next;
        if(front == null) // means temp is the last node
        {
            prev.next = null;
            temp.prev = null;
            return;
        }
        prev.next = front;
        front.prev = prev;
        temp.prev = null;
        temp.next = null;
    }

    static Node insertFirstNode(Node head,int k)
    {
        if(head == null ) return new Node(k);
        Node temp = new Node(k);
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    static Node insertLastNode(Node head,int k)
    {
        if(head == null ) return new Node(k);
        Node temp = new Node(k);
        Node x = head;
        while(x.next!=null)
        {
            x = x.next;
        }
        temp.prev = x;
        x.next = temp;
        return head;
    }


    static Node insertKthNode(Node head,int data , int k)
    {
        int c = 0;
        Node temp = head;
        while(temp!=null)
        {
            c++;
            if(c==k) break;
            temp = temp.next;
        }
        if(c == k)
        {
            Node prev = temp.prev;
            if(prev == null)
            {
                return insertFirstNode(head, data);
            }
            Node newNode = new Node(data);
            prev.next = newNode;
            temp.prev = newNode;
            newNode.next = temp;
            newNode.prev = prev;
        }
        return head;
    }

    public static void main(String[] args) {
        // To convert an array to a doubly linked list.
        Node a = convertArrayToList(new int[]{1,2,3,4,5,6});
        traversal(a);

        //To print a doubly liked list in reverse.
        // reverseTraversal(a);
        
        
        
        // <======================= Deletion Start here ====================>


        //To delete the head node of DLL.
        // Node b = deleteHeadNode(a);
        // traversal(b);
        // reverseTraversal(b);

        //To delete the tail node of DLL.
        // Node b = deleteTailNode(a);
        // traversal(b);
        // reverseTraversal(b);


        //To delete the Kth Node from DLL
        // Node b = deleteKthNode(a,3);
        // traversal(b);
        // reverseTraversal(b);


        // To delete a given node
        //I am just making a custom node to delete.
        // Node k1 = new Node(-1);
        // Node k2 = new Node(0);
        // k1.next = k2;
        // k2.next = a;
        // a.prev = k2;
        // k2.prev = k1; // -1 0 1 2 3 4 5 6
        // System.out.println("Before Deletion: ");
        // traversal(k1);
        // reverseTraversal(k1);
        // System.out.println("After Traversal");
        // delete(a);
        // traversal(k1);
        // reverseTraversal(k1);


        // <======================= Deletion End here ====================>

        // <======================= Insertion Start here ===================>
        
        // To insert the value in First Node
        // Node b = insertFirstNode(a, 0);
        // traversal(b);
        // reverseTraversal(b);


        // To insert the value in First Node
        // Node b = insertLastNode(a, 0);
        // traversal(b);
        // reverseTraversal(b);


        //To insert the value at Kth Index.
        Node b = insertKthNode(a, 0 , 0);
        traversal(b);
        reverseTraversal(b);


    }
}