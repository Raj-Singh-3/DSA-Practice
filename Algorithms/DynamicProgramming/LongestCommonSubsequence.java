// Leetcode 1143 Longest Common subsequence
// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.

 
// Example 1:
// Input: text1 = "abcde", text2 = "ace" 
// Output: 3  
// Explanation: The longest common subsequence is "ace" and its length is 3.

// Example 2:
// Input: text1 = "abc", text2 = "abc"
// Output: 3
// Explanation: The longest common subsequence is "abc" and its length is 3.

// Example 3:
// Input: text1 = "abc", text2 = "def"
// Output: 0
// Explanation: There is no such common subsequence, so the result is 0.
 

// Constraints:
// 1 <= text1.length, text2.length <= 1000
// text1 and text2 consist of only lowercase English characters.


public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "ACCTAB";
        Solution s = new Solution();
        System.out.println(s.longestCommonSubsequence(s1, s2));
    }
}

// <======================================with Memoisation ==================================>
// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int n = text1.length();
//         int m = text2.length();
//         int dp[][] = new int[n+1][m+1];
//         for(int i = 0;i<n+1;i++)
//         {
//             for(int j = 0;j<m+1;j++)
//             {
//                 dp[i][j] = -1;
//             }
//         }
//         return recur(n,m,text1,text2,dp);
//     }
//     public int recur(int i, int j, String text1, String text2, int dp[][])
//     {
//         if(i==0 || j==0)
//         {
//             dp[i][j] = 0;
//             return 0;
//         }
//         if(dp[i][j]!=-1)
//         {
//             return dp[i][j];
//         }
//         if(text1.charAt(i-1) == text2.charAt(j-1))
//         {
//             dp[i][j] = 1 + recur(i-1, j-1, text1, text2,dp);
//             return dp[i][j];
//         }
//         else
//         {
//             int case1 =  0 + recur(i-1, j, text1, text2,dp);
//             int case2 =  0 + recur(i, j-1, text1, text2,dp);
//             dp[i][j] = Math.max(case1,case2);
//             return dp[i][j];
//         }
//     }
// }


// <=============================With Tabulation =============================>
// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int n = text1.length();
//         int m = text2.length();
//         int dp[][] = new int[n+1][m+1];
//         for(int i = 1;i<n+1;i++)
//         {
//             for(int j = 1;j<m+1;j++)
//             {
//                 if(text1.charAt(i-1) == text2.charAt(j-1))
//                 {
//                     dp[i][j] = 1 + dp[i-1][j-1]; //recur(i-1, j-1, text1, text2,dp);
//                     //return dp[i][j];
//                 }
//                 else
//                 {
//                     int case1 =  0 + dp[i-1][j]; //recur(i-1, j, text1, text2,dp);
//                     int case2 =  0 + dp[i][j-1]; //recur(i, j-1, text1, text2,dp);
//                     dp[i][j] = Math.max(case1,case2);
//                     //return dp[i][j];
//                 }
//             }
//         }
//         return dp[n][m];
//     }
// }






// <==========================With space Optimisation solution=============================>
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int prev[] = new int[m+1];
        for(int i = 1;i<n+1;i++)
        {
            int cur[] = new int[m+1];

            for(int j = 1;j<m+1;j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    cur[j] = 1 + prev[j-1]; //recur(i-1, j-1, text1, text2,dp);
                    //return dp[i][j];
                }
                else
                {
                    int case1 =  0 + prev[j]; //recur(i-1, j, text1, text2,dp);
                    int case2 =  0 + cur[j-1]; //recur(i, j-1, text1, text2,dp);
                    cur[j] = Math.max(case1,case2);
                    //return dp[i][j];
                }
            }
            prev = cur;
        }
        return prev[m];
    }
}