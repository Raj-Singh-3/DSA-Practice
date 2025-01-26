// 198 House Robber
// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 
// Example 1:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.


// Example 2:

// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
// Total amount you can rob = 2 + 9 + 1 = 12.


// import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {2,6,78,90};
        s.rob(arr);
    }
}
// class Solution {
//     public int rob(int[] nums) {
//         //Here we will use shifting logic because our arr that stores value can goo to negative indices and array doesn't have negative indices.
//         int n = nums.length;
//         int arr[] = new int[n+1];
//         Arrays.fill(arr,-1);
//         return dp(nums,n,arr);
//     }
//     public int dp(int[] nums,int i,int arr[] )
//     {
//         //yaha par hum -1 or 0 ke bajaye 0 or 1 ki condition lagayenge because of shifting.
//         if(i == 1)
//         {
//             arr[i] = nums[0];
//             return nums[0];
//         }
//         if(i == 0)
//         {
//             arr[0] = 0;
//             return 0;
//         }
//         if(arr[i]!=-1)
//         {
//             return arr[i];
//         }
//         arr[i] = Math.max(nums[i-1]+dp(nums,i-2,arr), 0 + dp(nums,i-1,arr));
//         return arr[i];
//     }

// }


// <------------ with array and without Recursion stack ---------------->

// class Solution {
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int arr[] = new int[n+1];
//         arr[0] = 0;
//         arr[1] = nums[0];
//         for(int i = 2;i<=n;i++)
//         {
//             int pick = nums[i-1]+arr[i-2];
//             int nonPick = 0 + arr[i-1];
//             arr[i] = Math.max(pick,nonPick);
//         }
//         return arr[n];
//     }
// }


class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)
        {
            return nums[0];
        }
        //Instead of array we will just store its previous two states
        int prev2 = 0;
        int prev1 = nums[0];
        int ans = 0;
        for(int i = 2;i<=n;i++)
        {
            int pick = nums[i-1]+prev2;
            int nonPick = 0 + prev1;
            ans = Math.max(pick,nonPick);
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}