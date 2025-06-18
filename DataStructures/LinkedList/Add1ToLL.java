// https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

//You are given a linked list where each element in the list is a node and have an integer data. You need to add 1 to the number formed by concatinating all the list node numbers together and return the head of the modified linked list. Note: The head represents the first element of the given array.


// 1 -> 9 -> 9 -> null
// 9 -> 9 -> 9 -> 9 -> null
public class Add1ToLL {


    // <============== without Recursion =================>


    // public Node addOne(Node head) {
        // code here.
    //     Node temp = reverse(head);
    //     Node temp1 = temp;
    //     int carry = 1;
    //     while(temp1!=null)
    //     {
    //         if(carry == 0) break;
    //         temp1.val = temp1.val + carry;
    //         carry = temp1.val/10;
    //         temp1.val = temp1.val % 10;
    //         temp1 = temp1.next;
    //     }
    //     head = reverse(temp);
    //     if(carry == 1)
    //     {
    //         Node newNode  = new Node(1);
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     return head;
        
    // }
    // static Node reverse(Node k) {
    //     if(k == null || k.next == null) return k;
    //     Node prev = null;
    //     Node curr = k;
    //     Node front = k.next;
    //     while(front != null) {
    //         curr.next = prev;
    //         prev = curr;
    //         curr = front;
    //         front = front.next;
    //     }
    //     curr.next = prev;
    //     return curr;
    // }

    
    


// <====================With recursion ==============>
    public Node addOne(Node head) {
        int val = helper(head);
        if(val == 1)
        {
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    public int helper(Node temp)
    {
        if(temp == null)
        {
            return 1;
        }
        temp.val += helper(temp.next);
        int carry = temp.val/10;
        temp.val = temp.val%10;
        return carry;

    }
}
