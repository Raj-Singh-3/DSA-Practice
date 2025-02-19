// Given an integer array nums, return the length of the longest strictly increasing subsequence.

// Example 1:
// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

// Example 2:
// Input: nums = [0,1,0,3,2,3]
// Output: 4

// Example 3:
// Input: nums = [7,7,7,7,7,7,7]
// Output: 1
 

// Constraints:
// 1 <= nums.length <= 2500
// -10^4 <= nums[i] <= 10^4




import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        Solution s = new Solution();
        System.out.println(s.lengthOfLIS(nums));
    }
}

// <=================just to priint the length of longest Incresing subsequenc ===========>
// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int lis[] = new int[n];
//         Arrays.fill(lis,1);
//         int maxLen = 1;
//         for(int i = 1;i<n;i++)
//         {
//             for(int p = 0;p<i;p++)
//             {
//                 if(nums[p]<nums[i])
//                 {
//                     lis[i] = Math.max(lis[i],1+lis[p]);
//                 }

//             }
//             if(lis[i]>maxLen)
//             {
//                 maxLen = lis[i];
//             }
//         }
//         return maxLen;
//     }
// }

//<============================To print the value of LIS============================>
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int lis[] = new int[n];
        int prev[] = new int[n];
        for(int i=0;i<n;i++)
        {
            lis[i] = 1;
            prev[i] = i;
        }
        int maxLen = 1;
        int maxIndex = 0;
        for(int i = 1;i<n;i++)
        {
            for(int p = 0;p<i;p++)
            {
                if(nums[p]<nums[i])
                {
                    // lis[i] = Math.max(lis[i],1+lis[p]);
                    if(lis[i]<1+lis[p])
                    {
                        lis[i] = 1+lis[p];
                        prev[i] = p;
                    }
                }

            }
            if(lis[i]>maxLen)
            {
                maxLen = lis[i];
                maxIndex = i;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[maxIndex]);
        while(maxIndex!=prev[maxIndex])
        {
            maxIndex = prev[maxIndex];
            list.add(0,nums[maxIndex]);// handling the reverse by putting value in first index.
        }
        System.out.println(list);
        return maxLen;
    }
}