// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
// You are given an integer array arr[]. You need to find the maximum sum
// of a subarray (containing at least one element) in the array arr[].
public class KadanesAlgorithm {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0;i<n;i++)
        {
            currentSum += arr[i];
            max_sum = Math.max(currentSum,max_sum);
            if(currentSum<0)
            {
                currentSum = 0;
            }
        }
        return  max_sum;
    }
}