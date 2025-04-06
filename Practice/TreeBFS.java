import java.util.*;

public class TreeBFS{
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(9);
        Node c = new Node(20);
        Node d = new Node(15);
        Node e = new Node(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        BFS bfs = new BFS();
        ArrayList<Integer> arr = bfs.traversal(a);
        System.out.println(arr);
    }
}

class Node{
    Node left;
    Node right;
    int data;
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class BFS{
    // if out put in the form like this: 3,9,20,15,7
    public ArrayList<Integer> traversal(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root == null)
        {
            return arr;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node a = q.poll();
            int data = a.data;
            arr.add(data);
            if(a.left!=null) q.offer(a.left);
            if(a.right!=null) q.offer(a.right);
        }
        return arr;
    }
    // If output in the form like this: [[3],[9,20],[15,7]]
    public List<List<Integer>> levelOrder(Node root)
    {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null)
        {
            return arr;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> brr = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0;i<size;i++)
            {
                Node a = q.poll();
                int data = a.data;
                brr.add(data);
                if(a.left!=null) q.offer(a.left);
                if(a.right!=null) q.offer(a.right);
            }
            arr.add(brr);
            
        }
        return arr;
    }
}
