// https://leetcode.com/problems/subarrays-with-k-different-integers/description/

// Given an integer array nums and an integer k, return the number of good subarrays of nums.

// A good array is an array where the number of different integers in that array is exactly k.

// For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
// A subarray is a contiguous part of an array.

import java.util.HashMap;

public class SubarrayWithkDifferentIntegers {
    // <=========== TC: O(N*N) ==============>
    // public int subarraysWithKDistinct(int[] nums, int k) {
    //     int c = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         HashSet<Integer> ht = new HashSet<>();
    //         for(int j = i;j<nums.length;j++)
    //         {
    //             ht.add(nums[j]);
    //             if(ht.size() == k)
    //             {
    //                 c++;
    //             }
    //             if(ht.size()>k) break;
    //         }
    //     }
    //     return c;
    // }


    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k-1);
    }
    public int helper(int[] nums, int k)
    {
        int c = 0, l = 0, r = 0, n = nums.length;
        HashMap<Integer,Integer> ht = new HashMap<>();
        while(r<n)
        {
            ht.put(nums[r],ht.getOrDefault(nums[r], 0)+1);
            while(ht.size()>k)
            {
                ht.put(nums[l],ht.get(nums[l])-1);
                if(ht.get(nums[l]) == 0)
                {
                    ht.remove(nums[l]);
                }
                l+=1;
            }
            c += (r-l+1);
            r++;
        }
        return c;
    }
}
