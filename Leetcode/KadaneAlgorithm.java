public class KadaneAlgorithm {
    
}

class Solution{
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentPSum = 0;
        int currentNSum = 0;
        for(int num: nums)
        {
            currentPSum += num;
            maxSum = Math.max(maxSum,currentPSum);
            if(currentPSum<0)
            {
                currentPSum = 0;
            }

            currentNSum += num;
            minSum = Math.min(minSum,currentNSum);
            if(currentNSum>0)
            {
                currentPSum = 0;
            }
        }
        return Math.max(maxSum,Math.abs(minSum));
    }
}
