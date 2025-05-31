// https://leetcode.com/problems/jump-game-ii/description/

// You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

// Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

// 0 <= j <= nums[i] and
// i + j < n
// Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

public class JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        int l = 0,r = 0, jumps = 0;
        while(r<n-1)
        {
            int farthest = 0;
            for(int i = l;i<=r;i++)
            {
                farthest = Math.max(farthest,i+nums[i]);
            }
            l = r+1;
            r = farthest;
            jumps += 1;
        }
        return jumps;
    }

}
