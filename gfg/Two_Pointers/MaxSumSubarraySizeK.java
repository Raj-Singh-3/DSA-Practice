// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
// Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
//Note: A subarray is a contiguous part of any given array.
public class MaxSumSubarraySizeK {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int maxSum = 0;
        int sum = 0;
        for(int i = 0;i<k;i++)
        {
            sum += arr[i];
        }
        maxSum = Math.max(sum,maxSum);
        int j = 0;
        for(int i = k;i<arr.length;i++)
        {
            sum -= arr[j];
            sum += arr[i];
            j++;
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}