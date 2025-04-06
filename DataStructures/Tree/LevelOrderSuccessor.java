/* In this question we have to find level order successor of a given node. */
// what is level order successor?

//         5    level 0
//        / \
//       6   8  level 1 
//      / \  / \
//     1   2 4  3  level 2
//    / \
//    4  6

/* here level order succesor of 2--> 4 and 6-->8 and 3 --> 4  */

import java.util.LinkedList;
import java.util.Queue;

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

public class LevelOrderSuccessor {
    public int levelOrderSuccessor(Node root , int ele)
    {
        if(root == null)
        {
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node a = q.poll();
            int data = a.data;
            if(a.left!=null) 
            {
                q.offer(a.left);
            }
            if(a.right!=null) {
                q.offer(a.right);
            }
            if(data == ele)
            {
                if(q.isEmpty())
                {
                    return -1;
                }
                else
                {
                    return q.peek().data;
                }
            }
        }
        return -1;
    }
}
