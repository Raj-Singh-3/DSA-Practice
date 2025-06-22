// https://leetcode.com/problems/fruit-into-baskets/description/
// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick.

import java.util.HashMap;

public class FruitIntoBaskets {
    // <============== TC: O(2N) =======================>
    // public int totalFruit(int[] fruits) {
    //     int l = 0, r = 0, maxLength = 0, n = fruits.length;
    //     HashMap<Integer,Integer> ht = new HashMap<>();
    //     while(r<n)
    //     {
    //         ht.put(fruits[r],ht.getOrDefault(fruits[r], 0)+1);
    //         while(ht.size()>2)
    //         {
    //             ht.put(fruits[l],ht.get(fruits[l])-1);
    //             if(ht.get(fruits[l])==0)
    //             {
    //                 ht.remove(fruits[l]);
    //             }
    //             l++;
    //         }
    //         int length = r-l+1;
    //         maxLength = Math.max(maxLength, length);
    //         r++;
    //     }
    //     return maxLength;
    // }

    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, maxLength = 0, n = fruits.length;
        HashMap<Integer,Integer> ht = new HashMap<>();
        while(r<n)
        {
            ht.put(fruits[r],ht.getOrDefault(fruits[r], 0)+1);
            if(ht.size()>2)
            {
                ht.put(fruits[l],ht.get(fruits[l])-1);
                if(ht.get(fruits[l])==0)
                {
                    ht.remove(fruits[l]);
                }
                l++;
            }
            if(ht.size()<=2)
            {
                int length = r-l+1;
                maxLength = Math.max(maxLength, length);
            }
            r++;
        }
        return maxLength;
    }
}
