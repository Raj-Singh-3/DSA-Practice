// 62 Unique Paths

// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
// The test cases are generated so that the answer will be less than or equal to 2 * 109.

// Example1
// Input: m = 3, n = 7
// Output: 28

// Example 2:
// Input: m = 3, n = 2
// Output: 3
// Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down
 
// import java.util.*;
public class UniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        Solution s = new Solution();
        System.out.println(s.uniquePaths(m, n));
    }
}

// <=================With Recursion======================>
// class Solution {
//     public int uniquePaths(int m, int n) {
//         return recur(m-1,n-1);
//     }
//     public int recur(int m, int n)
//     {
//         if(m == 0 && n == 0)
//         {
//             return 1;
//         }
//         if(m<0 || n<0)
//         {
//             return 0;
//         }

//         int res =  recur(m-1, n)+ recur(m, n-1);
//         return res;
//     }
// }




//<=====================With Memoisation=========================>
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int dp[][] = new int[m+1][n+1];
//         for(int i =0;i<m+1;i++)
//         {
//             Arrays.fill(dp[i],-1);
//         }
//         return recur(m,n,dp);
//     }
//     public int recur(int m, int n, int dp[][])
//     {
//         if(m == 1 && n == 1)
//         {
//             dp[m][n] = 1;
//             return 1;
//         }
//         if(m==0 || n==0)
//         {
//             dp[m][n] = 0;
//             return dp[m][n];
//         }
//         if(dp[m][n] != -1)
//         {
//             return dp[m][n];
//         }
//         int res =  recur(m-1, n,dp) + recur(m, n-1,dp);
//         dp[m][n] = res;
//         return dp[m][n];
//     }
// }





// <============================With Tabulation==============================>
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int dp[][] = new int[m+1][n+1];
        
//         for(int i =0;i<m+1;i++)
//         {
//             for(int j = 0;j<n+1;j++)
//             {
//                 if(i == 1 && j == 1)
//                 {
//                     dp[i][j] = 1;
//                 }
//                 else if(i==0 || j==0)
//                 {
//                     dp[i][j] = 0;
//                 }
//                 else
//                 {
//                     dp[i][j] =  dp[i-1][j] + dp[i][j-1]; //recur(m-1, n,dp) + recur(m, n-1,dp);
//                 }
//             }
//         }
//         return dp[m][n]; //recur(m,n,dp);
//     }

// }






// <====================With Space Optimisation solution ================================>


class Solution {
    public int uniquePaths(int m, int n) {
        int prev[] = new int[n+1];
        for(int i =0;i<m+1;i++)
        {
            int cur[] = new int[n+1];
            for(int j = 0;j<n+1;j++)
            {
                if(i == 1 && j == 1)
                {
                    cur[j] = 1;
                }
                else if(i==0 || j==0)
                {
                    cur[j] = 0;
                }
                else
                {
                    cur[j] =  prev[j] + cur[j-1]; //recur(m-1, n,dp) + recur(m, n-1,dp);
                }
            }
            prev = cur;
        }
        return prev[n]; //recur(m,n,dp);
    }

}