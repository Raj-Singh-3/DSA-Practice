public class CoinChange {
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 11;
        Solution s = new Solution();
        System.out.println(s.coinChange(coins, amount));
    }
    
}


// <===========================With Recursion=============================>
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int n = coins.length;
//         int res = recur(coins,amount,n-1);
//         if(res == (int)(1e9))
//         {
//             return -1;
//         }
//         return res;
//     }
//     public int recur(int[] coins, int amount, int index )
//     {
//         if(index == 0)
//         {
//             if(amount%coins[index] == 0)
//             {
//                 return amount/coins[index];
//             }
//             else
//             {
//                 return (int)(1e9);
//             }
//         }

//         int pick = (int)(1e9);
//         if(amount>=coins[index])
//         {
//             pick = 1 + recur(coins,amount-coins[index],index);
//         }
//         int noPick = 0 + recur(coins,amount,index-1);
//         return Math.min(pick,noPick);
//     }
// }



//<====================With Top-down Dp (Memoisation)=======================>
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int n = coins.length;
//         int dp[][] = new int[n][amount+1];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<amount+1;j++)
//             {
//                 dp[i][j] = -1;
//             }
//         }
//         int res = recur(coins,amount,n-1,dp);
//         if(res == (int)(1e9))
//         {
//             return -1;
//         }
//         return res;
//     }
//     public int recur(int[] coins, int amount, int index , int dp[][])
//     {
//         if(index == 0)
//         {
//             if(amount%coins[index] == 0)
//             {
//                 dp[index][amount] = amount/coins[index];
//                 return dp[index][amount];
//             }
//             else
//             {
//                 dp[index][amount] = (int)(1e9);
//                 return (int)(1e9);
//             }
//         }

//         if(dp[index][amount]!=-1)
//         {
//             return dp[index][amount];
//         }

//         int pick = (int)(1e9);
//         if(amount>=coins[index])
//         {
//             pick = 1 + recur(coins,amount-coins[index],index,dp);
//         }
//         int noPick = 0 + recur(coins,amount,index-1,dp);
//         dp[index][amount] = Math.min(pick,noPick);
//         return dp[index][amount];
//     }
// }




// <========================With Bottom-up Dp(Tabulation)==================================>
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int n = coins.length;
//         int dp[][] = new int[n][amount+1];
//         for(int a = 0;a<amount+1;a++)
//         {
//             if(a%coins[0] == 0)
//             {
//                 dp[0][a] = a/coins[0];
//             }
//             else
//             {
//                 dp[0][a] = (int)(1e9);
//             }
//         }
//         for(int i=1;i<n;i++)
//         {
//             for(int j=0;j<amount+1;j++)
//             {
//                 int pick = (int)(1e9);
//                 if(j>=coins[i])
//                 {
//                     pick = 1 + dp[i][j-coins[i]]; //recur(coins,amount-coins[index],index,dp);
//                 }
//                 int noPick = 0 + dp[i-1][j]; //recur(coins,amount,index-1,dp);
//                 dp[i][j] = Math.min(pick,noPick);
//             }
//         }
//         int res = dp[n-1][amount];
//         if(res == (int)(1e9))
//         {
//             return -1;
//         }
//         return res;
//     }
// }



// <========================With Space Optimisation solution==================================>
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int prev[] = new int[amount+1];
        for(int a = 0;a<amount+1;a++)
        {
            if(a%coins[0] == 0)
            {
                prev[a] = a/coins[0];
            }
            else
            {
                prev[a] = (int)(1e9);
            }
        }
        for(int i=1;i<n;i++)
        {
            int cur[] = new int[amount+1];
            for(int j=0;j<amount+1;j++)
            {
                int pick = (int)(1e9);
                if(j>=coins[i])
                {
                    pick = 1 + cur[j-coins[i]]; //recur(coins,amount-coins[index],index,dp);
                }
                int noPick = 0 + prev[j]; //recur(coins,amount,index-1,dp);
                cur[j] = Math.min(pick,noPick);
            }
            prev = cur;
        }
        int res = prev[amount];
        if(res == (int)(1e9))
        {
            return -1;
        }
        return res;
    }
}