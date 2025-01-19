import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class IterativeDFS {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // Preorder Traversal
    public List<Integer> preorderTraversal(Node root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        Stack<Node> st = new Stack<>();
        // we will insert root here first
        st.push(root);
        while (!st.isEmpty()) {
            // phir ek ek node ko pick karenge aur uska data arraylist me store karenge.
            Node e = st.pop();
            arr.add(e.data);
            // yaha par hum stack use kar rahe hai, isliye pehle right waale ko insert
            // karenge
            if (e.right != null) {
                st.push(e.right);
            }
            // phir left waale ko taaki left top pe rahe, stack me
            if (e.left != null) {
                st.push(e.left);
            }
        }
        return arr;
    }

    // Inorder Traversal
    public List<Integer> inOrderTraversal(Node root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        Stack<Node> st = new Stack<>();
        Node node = root;
        // hum check karenge agar stack empty nahi hai ya node null nahi hai to hum left
        // me jaayenge.
        while (!st.isEmpty() || node != null) {
            while (node != null) {
                // stack me hum saare node ko store karenge till leftmost node tak na jaaye
                st.push(node);
                node = node.left;
            }
            // leftmost aane ke baad stack me se top node i.e. leftmost node ko pop karenge
            node = st.pop();
            // phir uss node ko store karenge and uske right me jaayenge
            arr.add(node.data);

            node = node.right;
        }
        return arr;
    }

    // PostOrder Traversal
    public List<Integer> postorderTraversal(Node root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
        Stack<Node> st = new Stack<>();
        Node node = root;
        // hum check karenge agar stack empty nahi hai ya node null nahi hai to hum left
        // me jaayenge.
        while (!st.isEmpty() || node != null) {
            // move to the left
            if (node != null) {
                // stack me hum saare node ko store karenge till leftmost node tak na jaaye
                st.push(node);
                node = node.left;
            } else {
                // move to the right, if right exist
                if (st.peek().right != null) {
                    node = st.peek().right;
                } else {
                    // if right don't exist or null
                    Node temp = st.pop();
                    arr.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        arr.add(temp.data);
                    }
                }
            }
        }
        return arr;
    }
}
