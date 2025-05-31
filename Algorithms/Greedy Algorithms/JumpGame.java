// https://leetcode.com/problems/jump-game/

// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.
public class JumpGame {
    public static void main(String[] args) {
        
    }
    public boolean canJump(int[] nums) {
        int i = 0;
        int maxIndex = 0;
        int n = nums.length;
        while(i<n)
        {
            if(i>maxIndex)
            {
                return false;
            }
            maxIndex = Math.max(maxIndex,i+nums[i]);
            i++;
        }
        return true;

    }
    
}
