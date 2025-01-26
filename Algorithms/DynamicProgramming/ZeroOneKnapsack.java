public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int val[] = {1, 2, 3};
        int wt[] = {4 ,5 ,1};
        int capacity = 4;
        System.out.println(knapsack(val, wt, capacity));
    }
    public static int knapsack(int val[], int wt[], int capacity)
    {
        int n = wt.length;

        //For recusrion
        // return recur(val,wt,capacity,n-1);


        // For Top-down Dp or Memoisation
        // int dp[][] = new int[n][capacity+1];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j = 0;j<capacity+1;j++)
        //     {
        //         dp[i][j] = -1;
        //     }
        // }
        // return recur(val,wt,capacity,n-1,dp);



        //For Bottom-Up Dp or tabulation 
        // int dp[][] = new int[n][capacity+1];
        
        // for(int c=0;c<=capacity;c++)
        // {
        //     if(wt[0] <= c) dp[0][c] = val[0];
        //     else dp[0][c] = 0;
        // }

        // for(int i=1;i<n;i++)
        // {
        //     for(int j = 0;j<=capacity;j++)
        //     {
        //         int pick = 0;
        //         if(wt[i]<=j)
        //         {
        //             pick =   val[i] + dp[i-1][j-wt[i]]; //val[index]+recur(val, wt, capacity-wt[index], index-1,dp);
        //         }
        //         int noPick =   0 + dp[i-1][j];//0 + recur(val, wt, capacity, index-1,dp);
        //         dp[i][j] = Math.max(pick,noPick);
        //     }
        // }
        // return dp[n-1][capacity];




        //Space Optimisation solution
        int prev[] = new int[capacity+1];
        
        for(int c=0;c<=capacity;c++)
        {
            if(wt[0] <= c) prev[c] = val[0];
            else prev[c] = 0;
        }

        for(int i=1;i<n;i++)
        {
            int cur[] = new int[capacity+1];
            for(int j = 0;j<=capacity;j++)
            {
                int pick = 0;
                if(wt[i]<=j)
                {
                    pick =   val[i] + prev[j-wt[i]]; //val[index]+recur(val, wt, capacity-wt[index], index-1,dp);
                }
                int noPick =   0 + prev[j];//0 + recur(val, wt, capacity, index-1,dp);
                cur[j] = Math.max(pick,noPick);
            }
            prev = cur;
        }
        return prev[capacity];
    }
    // public static int recur(int val[], int wt[], int capacity, int index)
    // {
    //     if(capacity == 0) return 0;
    //     if(index == 0)
    //     {
    //         if(wt[index]<=capacity)
    //         {
    //             return val[index];
    //         }
    //         else
    //         {
    //             return 0;
    //         }
    //     }
    //     int pick = 0;
    //     if(wt[index]<=capacity)
    //     {
    //         pick = val[index]+recur(val, wt, capacity-wt[index], index-1);
    //     }
    //     int noPick = 0 + recur(val, wt, capacity, index-1);
    //     return Math.max(pick,noPick);
    // }




    // public static int recur(int val[], int wt[], int capacity, int index,int dp[][])
    // {
    //     if(capacity == 0) 
    //     {
    //         dp[index][capacity] = 0;
    //         return 0;
    //     }
    //     if(index == 0)
    //     {
    //         if(wt[index]<=capacity)
    //         {
    //             dp[index][capacity] = val[index];
    //             return val[index];
    //         }
    //         else
    //         {
    //             dp[index][capacity] = 0;
    //             return 0;
    //         }
    //     }
        
    //     if(dp[index][capacity]!= -1)
    //     {
    //         return dp[index][capacity];
    //     }
    //     int pick = 0;
    //     if(wt[index]<=capacity)
    //     {
    //         pick = val[index]+recur(val, wt, capacity-wt[index], index-1,dp);
    //     }
    //     int noPick = 0 + recur(val, wt, capacity, index-1,dp);
    //     dp[index][capacity] = Math.max(pick,noPick);
    //     return dp[index][capacity];
    // }
}

