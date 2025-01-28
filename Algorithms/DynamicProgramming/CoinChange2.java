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
