// https://leetcode.com/problems/subsets-ii/description/

import java.util.ArrayList;

/*
Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]

 */
import java.util.*;
public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,new ArrayList<>(), arr);
        return arr;
    }
    public void helper(int i, int nums[], List<Integer> a1, List<List<Integer>> arr)
    {
        arr.add(new ArrayList<>(a1));
        for(int start = i;start<nums.length;start++)
        {
            if(start!=i && nums[start] == nums[start-1]) continue;
            a1.add(nums[start]);
            helper(start+1,nums,a1,arr);
            a1.remove(a1.size()-1);
        }
    }
}
