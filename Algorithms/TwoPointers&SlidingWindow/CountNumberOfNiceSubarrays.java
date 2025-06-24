// https://leetcode.com/problems/count-number-of-nice-subarrays/description/
// Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

// Return the number of nice sub-arrays.
public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
    public int helper(int nums[], int goal)
    {
        if(goal<0) return 0;
        int l = 0, r = 0, count = 0, sum = 0, n = nums.length;
        while(r<n)
        {
            sum += (nums[r]%2);
            while(sum>goal)
            {
                if(l<n && l>=0) sum = sum - (nums[l]%2);
                l+=1;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}
