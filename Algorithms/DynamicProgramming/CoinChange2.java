//Leetcode 518 Coin Change 2

// You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

// Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.
// You may assume that you have an infinite number of each kind of coin.
// The answer is guaranteed to fit into a signed 32-bit integer.

 

// Example 1:

// Input: amount = 5, coins = [1,2,5]
// Output: 4
// Explanation: there are four ways to make up the amount:
// 5=5
// 5=2+2+1
// 5=2+1+1+1
// 5=1+1+1+1+1
// Example 2:

// Input: amount = 3, coins = [2]
// Output: 0
// Explanation: the amount of 3 cannot be made up just with coins of 2.
// Example 3:

// Input: amount = 10, coins = [10]
// Output: 1

public class CoinChange2 {
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 11;
        Solution s = new Solution();
        System.out.println(s.change( amount,coins));
    }
}

class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int prev[] = new int[amount+1];
        for(int a = 0;a<amount+1;a++)
        {
            if(a%coins[0] == 0)
            {
                prev[a] = 1; //+a/coins[0];
            }
            else
            {
                prev[a] = 0; //(int)(1e9);
            }
        }
        for(int i=1;i<n;i++)
        {
            int cur[] = new int[amount+1];
            for(int j=0;j<amount+1;j++)
            {
                int pick = 0; //(int)(1e9);
                if(j>=coins[i])
                {
                    pick = cur[j-coins[i]]; //recur(coins,amount-coins[index],index,dp);
                }
                int noPick = 0 + prev[j]; //recur(coins,amount,index-1,dp);
                cur[j] = pick + noPick;
            }
            prev = cur;
        }
        int res = prev[amount];
        return res;
    }
}
