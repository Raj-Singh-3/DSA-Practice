import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Here we are just implementing BFS traversal using generic classes and Queues.
public class TreeDS {
    class Node<E>{
        E data;
        Node left;
        Node right;
        public Node(E data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public ArrayList<Integer> BFS(Node<Integer> root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null)
        {
            return arr;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node<Integer> a = q.poll();
            arr.add(a.data);
            if(a.left!=null)
            {
                q.offer(a.left);
            }
            if(a.right!=null)
            {
                q.offer(a.right);
            }
        }
        return arr;
    }
}
