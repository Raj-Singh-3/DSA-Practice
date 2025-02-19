//63 Unique paths 2

// You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
// An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
// Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
// The testcases are generated so that the answer will be less than or equal to 2 * 109.


//Example 1
// Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
// Output: 2
// Explanation: There is one obstacle in the middle of the 3x3 grid above.
// There are two ways to reach the bottom-right corner:
// 1. Right -> Right -> Down -> Down
// 2. Down -> Down -> Right -> Right


// Example2
// Input: obstacleGrid = [[0,1],[0,0]]
// Output: 1



public class UniquePaths2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int obstacleGrid[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(s.uniquePathsWithObstacles(obstacleGrid));
    }
}
// <=============================This code is space optimised and almost similar to UniquePaths=============>
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return uniquePaths(obstacleGrid, m,n);
    }
    public int uniquePaths(int[][] obstacleGrid,int m, int n) {
        int prev[] = new int[n+1];
        for(int i =1;i<m+1;i++)
        {
            int cur[] = new int[n+1];
            for(int j = 0;j<n+1;j++)
            {
                
                if(i==0 || j==0 || obstacleGrid[i-1][j-1] == 1)
                {
                    cur[j] = 0;
                }
                else if(i == 1 && j == 1)
                {
                    cur[j] = 1;
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
