// https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

// Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.

// 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2
public class Sort0s1s2s {
    static Node segregate(Node head) {
        if (head == null || head.next == null) return head;

        Node dummyOne = new Node(-1);
        Node dummyTwo = new Node(-1);
        Node dummyZero = new Node(-1);
        Node one = dummyOne;
        Node two = dummyTwo;
        Node zero = dummyZero;
        Node temp = head;

        while (temp != null) {
            if (temp.val == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.val == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        // Combine the 0 -> 1 -> 2 lists
        zero.next = dummyOne.next != null ? dummyOne.next : dummyTwo.next;
        one.next = dummyTwo.next;
        two.next = null;  // ✅ Terminate final list

        return dummyZero.next;
    }

}
