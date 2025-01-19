// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Leetcode 70

import java.util.*;
public class ClimbStairs {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.climbStairs(10);
    }
    
}
// <---------------------Top down dp ----------------->
class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return dp(n,arr);
    }
    public int dp(int n, int arr[])
    {
        if(n <= 2)
        {
            arr[n] = n;
            return n;
        }
        if(arr[n]!=-1)
        {
            return arr[n];
        }
        arr[n] = dp(n-1,arr) + dp(n-2,arr);
        return arr[n];
    }
}
// <---------------------Bottom up dp without using array, we can also use array----------------->
// class Solution {
//     public int climbStairs(int n) {
//         if(n <= 2)
//         {
//             return n;
//         }
//        int a1 = 1;
//        int a2 = 2;
//        int sum = 0;
//        for(int i = 3;i<=n;i++)
//        {
//             sum = a2 + a1;
//             a1 = a2;
//             a2 = sum;
//        } 
//        return sum;
//     }
// }