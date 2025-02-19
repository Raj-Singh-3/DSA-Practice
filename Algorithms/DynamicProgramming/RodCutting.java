// Given a rod of length n(size of price) inches and an array of prices, price. price[i] denotes the value of a piece of length i. Determine the maximum value obtainable by cutting up the rod and selling the pieces.

// Example:

// Input: price[] = [1, 5, 8, 9, 10, 17, 17, 20]
// Output: 22
// Explanation: The maximum obtainable value is 22 by cutting in two pieces of lengths 2 and 6, i.e., 5+17=22.
// Input: price[] = [3, 5, 8, 9, 10, 17, 17, 20]
// Output: 24
// Explanation: The maximum obtainable value is 24 by cutting the rod into 8 pieces of length 1, i.e, 8*price[1]= 8*3 = 24.
// Input: price[] = [1, 10, 3, 1, 3, 1, 5, 9]
// Output: 40
// Constraints:
// 1 ≤ price.size() ≤ 10^3
// 1 ≤ price[i] ≤ 10^6

import java.util.*;
public class RodCutting {
    public static void main(String[] args) {
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        Solution s = new Solution();
        System.out.println(s.cutRod(price));
    }
    
}

class Solution {
    public int cutRod(int[] price) {
        // code here
        int N = price.length;
        int dp[][] = new int[N][N+1];
        for(int i = 0;i<N;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return recur(N,N-1,price,dp);
    }
    public int recur(int N, int ind, int price[], int dp[][])
    {
        if(ind == 0)
        {
            dp[ind][N] = N*price[ind];
            return dp[ind][N];
        }
        
        if(dp[ind][N]!=-1)
        {
            return dp[ind][N];
        }
        int curLen = ind+1;
        int pick = 0;
        if(N>=curLen)
        {
            pick = price[ind]+recur(N-curLen,ind,price,dp);
        }
        int noPick = 0+recur(N,ind-1,price,dp);
        dp[ind][N] = Math.max(pick,noPick);
        return dp[ind][N];
    }
}