/*
Given an array nums of distinct integers, return all the possible permutations.
You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
*/
import java.util.*;
public class AllPermutationOfArray {
    public List<List<Integer>> permute(int[] nums) {
        boolean map[] = new boolean[nums.length];
        List<List<Integer>> arr = new ArrayList<>();
        helper(0,nums,map,new ArrayList<>(),arr);
        return arr;

    }
    public void helper(int ind, int nums[], boolean map[], List<Integer> a1,List<List<Integer>> arr)
    {
        if(a1.size() == nums.length)
        {
            arr.add(a1);
            return;
        }
        for(int i = ind;i<nums.length;i++)
        {
            if(!map[i]){
                map[i] = true;
                a1.add(nums[i]);
                helper(i+1,nums,map,a1,arr);
                a1.remove(a1.size()-1);
                map[i] = false;
            }
        }
    }
}
