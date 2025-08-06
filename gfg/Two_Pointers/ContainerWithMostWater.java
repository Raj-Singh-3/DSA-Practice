// https://www.geeksforgeeks.org/problems/container-with-most-water0535/1

// Given an array arr[] of non-negative integers, where each element arr[i]
// represents the height of the vertical lines, find the maximum amount of water
// that can be contained between any two lines, together with the x-axis.
// Note: In the case of a single vertical line it will not be able to hold water.
public class ContainerWithMostWater {
    public int maxWater(int arr[]) {
        // Code Here
        int left = 0,right = arr.length-1;
        int max = 0;
        while(left<right)
        {
            int base = right-left;
            int height = Math.min(arr[right], arr[left]);
            int area = base * height;
            max = Math.max(max,area);
            if(arr[left]<arr[right]) left++;
            else right--;
        }
        return  max;
    }
}