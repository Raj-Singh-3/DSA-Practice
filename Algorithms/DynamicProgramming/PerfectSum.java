// Perfect Sum Problem (From GFG)


// Given an array arr of non-negative integers and an integer target, the task is to count all subsets of the array whose sum is equal to the given target.

// Examples:

// Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
// Output: 3
// Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.

// Input: arr[] = [2, 5, 1, 4, 3], target = 10
// Output: 3
// Explanation: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the target 10.

// Input: arr[] = [5, 7, 8], target = 3
// Output: 0
// Explanation: There are no subsets of the array that sum up to the target 3.

// Input: arr[] = [35, 2, 8, 22], target = 0
// Output: 1
// Explanation: The empty subset is the only subset with a sum of 0.

public class PerfectSum {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 10, 6, 8};
        int target = 10;
        int N = arr.length;
        // recur(arr,target,N-1);//With recursion

        // <===============With Dp ========================>
    
        // int dp[][] = new int[N][target+1];
        // for(int i = 0;i<N;i++)
        // {
        //     for(int j = 0;j<target+1;j++)
        //     {
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(recur(arr,target,N-1,dp));


        // <=================With Tabulation==============>
        // int dp[][] = new int[N][target+1];
        // System.out.println(tabulation(arr, target, N, dp));


        //<================= With Space Optimisation ======================>
        System.out.println(tabulation2(arr, target, N));




    }

    // <==========================With Recursion=========================>
    // public static int recur(int arr[],int target,int index)
    // {
    //     if(index == 0)
    //     {
    //         if(target == 0 && arr[index] == 0)
    //         {
    //             return 2;
    //         }
    //         else if(target == 0)
    //         {
    //             return 1;
    //         }
    //         else if(target == arr[index])
    //         {
    //             return 1;
    //         }
    //         return 0;
    //     }

    //     int pick = 0;
    //     if(arr[index]<=target)
    //     {
    //         pick = recur(arr, target-arr[index], index-1);
    //     }
    //     int noPick = recur(arr, target, index-1);
    //     return pick + noPick;
    // }


    
    // <===================== With DP =========================>
    // public static int recur(int arr[],int target,int index , int dp[][])
    // {
    //     if(index == 0)
    //     {
    //         if(target == 0 && arr[index] == 0)
    //         {
    //             dp[index][target] = 2;
    //             return 2;
    //         }
    //         else if(target == 0)
    //         {
    //             dp[index][target] = 1;
    //             return 1;
    //         }
    //         else if(target == arr[index])
    //         {
    //             dp[index][target] = 1;
    //             return 1;
    //         }
    //         else
    //         {
    //             dp[index][target] = 0;
    //             return 0;
    //         }
    //     }
    //     if(dp[index][target]!=-1)
    //     {
    //         return dp[index][target];
    //     }
    //     int pick = 0;
    //     if(arr[index]<=target)
    //     {
    //         pick = recur(arr, target-arr[index], index-1,dp);
    //     }
    //     int noPick = recur(arr, target, index-1,dp);
    //     dp[index][target] = pick + noPick;
    //     return dp[index][target];
    // }





// <=================================With Tabulation ======================================>
    // public static int tabulation(int nums[],int target,int index , int dp[][])
    // {
    //     int N = nums.length;
    //     for(int t=0;t<target+1;t++)
    //     {
    //         if (t == 0 && nums[0] == 0) {
    //             dp[0][t] = 2;
    //         }
    //         else if(t == 0)
    //         {
    //             dp[0][t] = 1;
    //         }
    //         else if(t == nums[0])
    //         {
    //             dp[0][t] = 1;
    //         }
    //         else
    //         {
    //             dp[0][t] = 0;
    //         }
    //     }

    //     for(int i = 1;i<N;i++)
    //     {
    //         for(int j = 0;j<target+1;j++)
    //         {
    //             int pick = 0;
    //             if(nums[i]<=j)
    //             {
    //                 pick =  dp[i-1][j-nums[i]];// recur(arr, target-arr[index], index-1,dp);
    //             }
    //             int noPick =  dp[i-1][j]; //recur(arr, target, index-1,dp);
    //             dp[i][j] = pick + noPick;
    //         }
    //     }
    //     return dp[N-1][target];
    // }




    // <========================With Optimised Space============================>
    public static int tabulation2(int nums[],int target,int index)
    {
        int N = nums.length;
        int prev[] = new int[target+1];
        for(int t=0;t<target+1;t++)
        {
            if (t == 0 && nums[0] == 0) {
                prev[t] = 2;
            }
            else if(t == 0)
            {
                prev[t] = 1;
            }
            else if(t == nums[0])
            {
                prev[t] = 1;
            }
            else
            {
                prev[t] = 0;
            }
        }

        for(int i = 1;i<N;i++)
        {
            int cur[] = new int[target+1];
            for(int j = 0;j<target+1;j++)
            {
                int pick = 0;
                if(nums[i]<=j)
                {
                    pick =  prev[j-nums[i]];// recur(arr, target-arr[index], index-1,dp);
                }
                int noPick =  prev[j]; //recur(arr, target, index-1,dp);
                cur[j] = pick + noPick;
            }
            prev = cur;
        }
        return prev[target];
    }
}
