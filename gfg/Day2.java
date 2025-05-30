public class Day2 {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int j = 0;
        int c = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j] = arr[i]; // non-zero element will be stored at j
                j++;
            }
            else
            {
                c++; // will store no. of zeroes in the array.
            }
        }
        int k = n-1;
        while(c-- >0)
        {
            arr[k] = 0;
            k--;
        }
    }
}
