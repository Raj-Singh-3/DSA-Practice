//https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
//Given an array of positive integers arr[] and a value sum, determine if there is a subset of arr[] with sum equal to given sum.
//Examples:
//
//Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 9
//Output: true
//Explanation: Here there exists a subset with target sum = 9, 4+3+2 = 9.
//Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 30
//Output: false
//Explanation: There is no subset with target sum 30.
//Input: arr[] = [1, 2, 3], sum = 6
//Output: true
//Explanation: The entire array can be taken as a subset, giving 1 + 2 + 3 = 6.


import java.util.Arrays;

public class SubsetSum {

    static Boolean isSubsetSum(int arr[], int sum) {
        int dp[] = new int[arr.length+1];
        Arrays.fill(dp,-1);
        return  helper(0,arr,sum,dp)==1?true:false;
    }
    public static int helper(int i,int arr[], int sum, int dp[])
    {
        if(i>=arr.length)
        {
            if(sum == 0)
            {
                dp[i] = 1;
            }
            else{
                dp[i] = 0;
            }
            return dp[i];
        }
        if(dp[i-1]!=-1) return dp[i-1];
        int pick = helper(i+1,arr,sum-arr[i],dp);
        int noPick = helper(i+1,arr,sum,dp);
        return ((pick==1)||(noPick==1))?1:0;
    }

    // Now By using DP
}
