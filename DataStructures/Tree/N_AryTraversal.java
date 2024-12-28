//Here we will traverse in a tree that can have any no. of children using BFS

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class N_AryTraversal {
    class N_Ary<E>{
        int data;
        ArrayList<N_Ary> child;
        public N_Ary(int data) {
            this.data = data;
            child = new ArrayList<>();
        }
    }
    //This is the original code.
    // public ArrayList<Integer> BFS(N_Ary<Integer> root)
    // {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     Queue<N_Ary> q = new LinkedList<>();
    //     q.offer(root);
    //     while(!q.isEmpty())
    //     {
    //         // Tree se ek ek node nikaalenge
    //         N_Ary<Integer> a = q.poll();
    //         // useke data ko arraylist me store karenge
    //         arr.add(a.data);   
    //         // uske saare childrens ko Queue me store karenge
    //         for(int i = 0;i<a.child.size();i++)
    //         {
    //            if(a.child.get(i)!=null)
    //            {
    //               q.offer(a.child.get(i));
    //            }
    //         }
    //     }
    //     return arr;
    // }


    // we have made some arrangement here because if tree is like this we have to give the arraylist as arraylist of arraylist in leetcode

//      5    level 0
//     / \
//    6   8  level 1 
//   / \  / \
//  3   2 4  3  level 2
// / \
// 4   6

// [[5],[6,8],[3,2,4,3],[4,6]] , so to give answer in this way , we will modified it.
    public ArrayList<ArrayList> BFS2(N_Ary<Integer> root)
    {
        ArrayList<ArrayList> arr = new ArrayList<>();
        Queue<N_Ary> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s = q.size(); 
            ArrayList<Integer> temp = new ArrayList<>();
            while(s>0)
            {
                // Tree se ek ek node nikaalenge
                N_Ary<Integer> a = q.poll();
                // useke data ko arraylist me store karenge
                temp.add(a.data);              
                // uske saare childrens ko Queue me store karenge
                for(int i = 0;i<a.child.size();i++)
                {
                if(a.child.get(i)!=null)
                {
                    q.offer(a.child.get(i));
                }
                }
                s--;
            }
            arr.add(temp);
            
        }
        return arr;
    }

    
}
