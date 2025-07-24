public class SubsequenceSumEqualsToK {
    static int c = 0;
    public int numSubseq(int[] nums, int target) 
    {
        helper(0,nums,target,0);
        return c;
    }
    public void helper(int i , int nums[], int target, int sum)
    {
        if(i>=nums.length)
        {
            return;
        }
        if(sum == target)
        {
            c++;
        }
        sum += nums[i];
        helper(i+1,nums,target,sum);
        sum -= nums[i];
        helper(i+1,nums,target,sum);
    }
}
