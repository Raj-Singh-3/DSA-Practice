// https://leetcode.com/problems/max-consecutive-ones-iii/description/
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

public class MaxConsecutiveOnes {

    // <====== TC : O(2N)===========>
    // public int longestOnes(int[] nums, int k) {
    //     int l = 0, r = 0, maxLength = 0;
    //     int zeroes = 0, n = nums.length;
    //     while(r<n)
    //     {
    //         if(nums[r] == 0) zeroes++;
    //         while(zeroes > k)
    //         {
    //             if(nums[l] == 0) zeroes--;
    //             l++;
    //         }
    //         int length = r-l+1;
    //         maxLength = Math.max(maxLength,length);
    //         r++;
    //     }
        
    //     return maxLength;
    // }


    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxLength = 0;
        int zeroes = 0, n = nums.length;
        while(r<n)
        {
            if(nums[r] == 0) zeroes++;
            if(zeroes > k)
            {
                if(nums[l] == 0) zeroes--;
                l++;
            }
            if(zeroes<=k)
            {
                int length = r-l+1;
                maxLength = Math.max(maxLength,length);
            }
            r++;
        }
        
        return maxLength;
    }
}
