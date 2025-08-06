// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
//Note: You need to solve this problem without utilizing the built-in sort function.

public class Sort_0s1s2s {
    public void sort012(int[] arr) {
        // code here
        int left = 0, right = arr.length-1, i = 0;
        // 2, 2, 0, 1, 1, 0
        while(i<=right)
        {
            if(arr[i] == 1)
            {
                i++;
            }
            else if(arr[i] == 0)
            {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
                i++;
            }
            else if(arr[i] == 2)
            {
                int temp = arr[right];
                arr[right] = arr[i];
                arr[i] = temp;
                right--;
            }
        }
    }