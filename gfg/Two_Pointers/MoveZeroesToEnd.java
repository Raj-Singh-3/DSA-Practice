// https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
// You are given an array arr[] of non-negative integers. You have to move all
// the zeros in the array to the right end while maintaining the relative order of the
// non-zero elements. The operation must be performed in place, meaning you should not use extra
// space for another array.
public  class MoveZeroesToEnd {
//    Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//    Output: [1, 2, 4, 3, 5, 0, 0, 0]
    void pushZerosToEnd(int[] arr) {
        // code here
            int n = arr.length;
            int j = 0;
            for(int i = 0;i<n;i++)
            {
                if(arr[i]!=0)
                {
                    arr[j] = arr[i];
                    j++;
                }
            }
        }
}
