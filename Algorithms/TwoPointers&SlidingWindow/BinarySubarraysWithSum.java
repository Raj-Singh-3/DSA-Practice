// https://leetcode.com/problems/binary-subarrays-with-sum/

// Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

// A subarray is a contiguous part of the array.

public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums, goal) - helper(nums, goal-1);
    }
    public int helper(int nums[], int goal)
    {
        if(goal<0) return 0;
        int l = 0, r = 0, count = 0, sum = 0, n = nums.length;
        while(r<n)
        {
            sum += nums[r];
            while(sum>goal)
            {
                if(l<n && l>=0) sum = sum - nums[l];
                l+=1;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}

