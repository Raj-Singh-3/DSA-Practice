// https://www.geeksforgeeks.org/problems/key-pair5616/1
// Given an array arr[] of integers and another integer target. Determine if there exist
// two distinct indices such that the sum of their elements is equal to the target.
import java.util.*;
public  class TwoSum {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        // 1 2 4 5 6 9 , k = 5
        while(i<j)
        {
            int sum = arr[i]+arr[j];
            if(sum == target) return true;
            else if(sum>target) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,9};
        TwoSum t = new TwoSum();
        System.out.println(t.twoSum(arr,5));
    }
}