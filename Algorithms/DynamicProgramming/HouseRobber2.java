public class HouseRobber2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {2,6,78,90};
        s.rob(arr);
    }
}
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)
        {
            return nums[0];
        }
        int last[] = new int[n-1];
        int first[] = new int[n-1];
        int j = 1;
        int k = 0;
        for(int i=0;i<n-1;i++)
        {
            last[i] = nums[j];
            first[i] = nums[k];
            j++;
            k++;
        }
        int a = rob1(last);
        int b = rob1(first);
        return Math.max(a,b);
    }
    // Ye House Robber1 ka code hai as it is
    public int rob1(int[] nums) {
        int n = nums.length;
        if(n == 1)
        {
            return nums[0];
        }
        //Instead of array we will just store its previous two states
        int prev2 = 0;
        int prev1 = nums[0];
        int ans = 0;
        for(int i = 2;i<=n;i++)
        {
            int pick = nums[i-1]+prev2;
            int nonPick = 0 + prev1;
            ans = Math.max(pick,nonPick);
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}
