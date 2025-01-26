// Given an array arr and target sum k, check whether there exists a subsequence such that the sum of all elements in the subsequence equals the given target sum(k). (From GFG)


// Example:

// Input:  arr = [10,1,2,7,6,1,5], k = 8.
// Output:  Yes
// Explanation:  Subsequences like [2, 6], [1, 7] sum upto 8

// Input:  arr = [2,3,5,7,9], k = 100. 
// Output:  No
// Explanation:  No subsequence can sum upto 100




public class checkSumOfSubsequenceEqualsK{
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int K = 8;
        int N = arr.length;
        System.out.println(Solution.checkSubsequenceSum(N,arr,K));
    }

}

// <------------------------------With Recursion----------------------------->

// class Solution {
//     public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
//       // code here
//       return recur(arr,K,N-1);
//     }
//      public static boolean recur(int arr[], int k , int i)
//     {
//         if(k == 0)
//         {
//             return true;
//         }
//         if(i == 0)
//         {
//             if(arr[i] == k) return true;
//             return false;
//         }
//         boolean pick = false;
//         if(arr[i]<=k)
//         {
//           pick = recur(arr,k-arr[i],i-1);
//           if(pick)
//           {
//               return true;
//           }
//         }
//         boolean noPick = recur(arr,k,i-1);
//         return noPick;
//     }
//   }


// <========================================With Memoisation(dp)=================================>
//   class Solution {
//     public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
//       // code here
//       int dp[][] = new int[N][K+1];
//       return recur(arr,K,N-1,dp);
//     }
    //  public static boolean recur(int arr[], int k , int i, int dp[][])
    // {
    //     if(k == 0)
    //     {
    //         //1 means True;
    //         //2 means False;
    //         //0 means Unvisited;
    //         dp[i][k] = 1;
    //         return true;
    //     }
    //     if(i == 0)
    //     {
    //         if(arr[i] == k) 
    //         {
    //             dp[i][k] = 1;
    //             return true;
    //         }
    //         dp[i][k] = 2;
    //         return false;
    //     }
    //     if(dp[i][k]!=0)
    //     {
    //         return dp[i][k]==1?true:false;
    //     }
    //     boolean pick = false;
    //     if(arr[i]<=k)
    //     {
    //       pick = recur(arr,k-arr[i],i-1,dp);
    //       if(pick)
    //       {
    //           dp[i][k] = 1;
    //           return true;
    //       }
    //     }
    //     boolean noPick = recur(arr,k,i-1,dp);
    //     dp[i][k] = (noPick == true)?1:2;
    //     return noPick;
    // }
// }






// <====================================With Tabulation =====================================>
class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
      // code here
      int dp[][] = new int[N][K+1];
      //It represents that when the value of k becomes 0 the result will automatically be true
      for(int i = 0;i<N;i++)
      {
          dp[i][0] = 1;
      }
      //It starts from 1 because when it t = 0, it is lready true, as per above 'for' loop.
      for(int t = 1;t<=K;t++)
      {
          // when index = 0 and K == arr[0]
          if(arr[0] == t)
          {
              dp[0][t] = 1;
          }
          else
          {
              dp[0][t] = 2;
          }
      }
      
      for(int i = 1;i<N;i++)
      {
          for(int j = 1;j<=K;j++)
          {
              int pick = 2;
              if(arr[i]<=j)
              {
                  pick = dp[i-1][j-arr[i]];
                  if(pick == 1)
                  {
                      dp[i][j] = 1;
                      continue;
                  }
               }
              int noPick = dp[i-1][j];
              dp[i][j] = noPick;
          }
      }
      return dp[N-1][K] == 1;
    }
}