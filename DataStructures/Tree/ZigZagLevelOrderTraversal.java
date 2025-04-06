// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

/*Zig-Zag Level Order Traversal is a binary tree traversal algorithm that traverses the tree in a zigzag pattern. The traversal starts from the root node and alternates between left-to-right and right-to-left at each level of the tree.*/
// For example, given the following binary tree:   
//         1
//        / \
//       2   3
//      / \ / \
//     4  5 6  7
// The zigzag level order traversal would be:
// [[1], [3, 2], [4, 5, 6, 7]]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
   }
}

public class ZigZagLevelOrderTraversal {
    public List<List<Integer>> levelOrderZigZag(TreeNode root)
    {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null)
        {
            return arr;
        }
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty())
        {
            ArrayList<Integer> brr = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0;i<size;i++)
            {
                if(!flag)
                {
                    TreeNode a = q.pollFirst();
                    int data = a.val;
                    brr.add(data);
                    if(a.left!=null) q.addLast(a.left);
                    if(a.right!=null) q.addLast(a.right);
                }
                else
                {
                    TreeNode a = q.pollLast();
                    int data = a.val;
                    brr.add(data);
                    if(a.right!=null) q.addFirst(a.right);
                    if(a.left!=null) q.addFirst(a.left);
                }
                
            }
            flag = !flag;
            arr.add(brr);
            
        }
        return arr;
    }
}