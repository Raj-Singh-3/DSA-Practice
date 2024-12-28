import java.util.ArrayList;


public class DFS {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    //Inorder Traversal
    public ArrayList<Integer> inorder (Node root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        inorderHelper(root, arr);
        return arr;
    }
    public void inorderHelper(Node root, ArrayList<Integer>  arr)
    {
        if(root == null)
        {
            return;
        }
        inorderHelper(root.left, arr);
        arr.add(root.data);
        inorderHelper(root.right,arr);

        
    }


    //PreOrder Traversal
    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        preOrderHelper(root, arr);
        return arr;
    }
    
    public static void preOrderHelper(Node root, ArrayList<Integer>  arr)
    {
        if(root == null)
        {
            return;
        }
        arr.add(root.data);
        preOrderHelper(root.left, arr);
        preOrderHelper(root.right,arr);
    }

    //PostOrder Traversal
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        postOrderHelper(root, arr);
        return arr;
    }
    
    public void postOrderHelper(Node root, ArrayList<Integer>  arr)
    {
        if(root == null)
        {
            return;
        }
        postOrderHelper(root.left, arr);
        postOrderHelper(root.right,arr);
        arr.add(root.data);
    }
}
