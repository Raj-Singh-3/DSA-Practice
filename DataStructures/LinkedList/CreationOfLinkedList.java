class Node{
    int val;
    Node next;
    public Node(int val)
    {
        this.val = val;
    }
    public Node(int val, Node next)
    {
        this.val = val;
        this.next = next;
    }
}

public class CreationOfLinkedList {

    static Node convertArrayToLinkedList(int arr[])
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }

    static int searchElement(Node head, int val)
    {
        Node x3 = head;
        while(x3!=null)
        {
            if(x3.val == val)
            {
                return 1;
            }
            x3 = x3.next;
        }
        return -1;
    }

    static void traversal(Node head)
    {
        Node x3 = head;
        while(x3!=null)
        {
            System.out.print(x3.val+" ");
            x3 = x3.next;
        }
        System.out.println();
    }

    static int lengthOfLinkedList(Node head)
    {
        Node x3 = head;
        int c = 0;
        while(x3!=null)
        {
            x3 = x3.next;
            c++;
        }
        return c;
    }

    static Node removeHeadOfLinkedList(Node head)
    {
        if(head == null) return head;
        head = head.next;
        return head;
    }

    // while removing tail of the linkedlist we have to go to third last element because last element is null, second last we have to remove and we have to make last third element to point to null.
    // nodes =  2 -> 3 -> 4 -> 5 -> 6 -> null.
    // we have to stop at 5 and make 5->null
    // then we get, 2 -> 3 -> 4 -> 5 -> null.

    static Node removeTail(Node head)
    {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null; //5->null
        return head;
    }

    // nodes =  2 -> 3 -> 4 -> 5 -> 6 -> null. and k = 2
    // so the output will be 2 -> 4 -> 5 -> 6 -> null. beacuse 2nd index is removed.
    // Now for that we will take count variable that checks  c == k or not? if it is then 
    // prev.next = prev.next.next; where prev = 2;
    // so output becomes 2 -> 4

    static Node removeKthNode(Node head, int k)
    {
        if(head == null) return head;
        if(k == 1)
        {
            Node temp = head;
            temp = temp.next;
            return temp;
        }
        int c = 0;
        Node prev = null, temp = head;
        while(temp!=null)
        {
            c++;
            if(c == k)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    static Node removeElement(Node head, int ele)
    {
        if(head == null) return head;
        if(ele == head.val)
        {
            Node temp = head;
            temp = temp.next;
            return temp;
        }
        Node prev = null, temp = head;
        while(temp!=null)
        {
            if(temp.val == ele)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


    static Node insertHead(Node head, int ele)
    {
        Node temp = new Node(ele);
        temp.next = head;
        return temp;
    }

    static Node insertTail(Node head, int ele)
    {
        
        Node temp = new Node(ele);
        temp.next = null;

        if(head == null) return temp;

        Node x = head;
        while(x.next!=null)
        {
            x = x.next;
        }
        x.next = temp;
        return head;
    }

    static Node insertAtKthPosition(Node head, int ele, int k)
    {

        if(head == null)
        {
            if(k == 1) return new Node(ele);
            return null;
        }
        Node temp = new Node(ele);
        Node x = head;
        if(k == 1)
        {
            temp.next = head;
            return temp;
        }
        int c = 0;
        while(x!=null)
        {
            c++;
            if(c == k-1)
            {
                temp.next = x.next;
                x.next = temp;
                break;
            }
            x = x.next;
        }
        return head;


    }

    static Node insertBeforeGivenElementK(Node head, int ele, int k)
    {

        if(head == null)
        {
            return null;
        }
        
        Node temp = new Node(ele);
        if(head.val == k)
        {
            temp.next = head;
            return temp;
        }
        Node x = head;
        while(x.next!=null)
        {
            if(x.next.val == k)
            {
                temp.next = x.next;
                x.next = temp;
                break;
            }
            x = x.next;
        }
        return head;
    }
    public static void main(String[] args) {
        // //I want to make linkedlist of [10, 11, 12]
        // Node x1 = new Node(12);
        // Node x2 = new Node(11,x1);
        // Node x3 = new Node(10,x2);
        // while(x3!=null)
        // {
        //     System.out.print(x3.val+" ");
        //     x3 = x3.next;
        // }
        // System.out.println();


        //To check 'convertArrayToLinkedList' working or not
        int arr[] = {1,2,3,4,56};
        Node head = CreationOfLinkedList.convertArrayToLinkedList(arr);
        Node temp = head;
        CreationOfLinkedList.traversal(temp);


        // //To check the length of linkedlist is correct or not...
        // System.out.println(CreationOfLinkedList.lengthOfLinkedList(head));

        // //searching for an element in the linkedlist if exist return 1 else -1.
        // System.out.println(CreationOfLinkedList.searchElement(head, 4));

// <=============================Deletion Start here ==============================>


        // //To remove the head of the linkedlist
        // Node k = CreationOfLinkedList.removeHeadOfLinkedList(head);
        // CreationOfLinkedList.traversal(k);


        // //To remove the tail of the linkedlist
        // k = CreationOfLinkedList.removeTail(head);
        // CreationOfLinkedList.traversal(k);

        // //To remove the kth index from the linkedlist
        // Node a = CreationOfLinkedList.removeKthNode(head,4);
        // CreationOfLinkedList.traversal(a);


        // //To remove the element from the linkedlist
        // Node a = removeElement(head, 1);
        // traversal(a);

        // <=============================Deletion Complete here ================================>


        // <=============================Insertion Start here ================================>
        
        // //To insert a new element in the head.
        // Node a = insertHead(head, 0);
        // traversal(a);

        // //To insert a new element in the tail.
        // Node a = insertTail(head, 122);
        // traversal(a);

        // //To insert a new element at kth position
        // Node a = insertAtKthPosition(head, 23, 5);
        // traversal(a);

        // Insert before an element present in the linkedlist
        Node a = insertBeforeGivenElementK(head, 34, 6);
        traversal(a);

    }


    
}
