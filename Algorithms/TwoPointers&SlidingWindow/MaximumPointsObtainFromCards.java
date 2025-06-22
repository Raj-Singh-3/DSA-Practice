// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

// Your score is the sum of the points of the cards you have taken.

// Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

public class MaximumPointsObtainFromCards{
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        for(int i = 0;i<k;i++)
        {
            lsum += cardPoints[i];
        }
        maxSum = lsum;
        int rightIndex = cardPoints.length-1;
        for(int i = k-1;i>=0;i--)
        {
            lsum -= cardPoints[i];
            rsum += cardPoints[rightIndex];
            maxSum = Math.max(maxSum,lsum+rsum);
            rightIndex-=1;
        }
        return maxSum;
    }
}