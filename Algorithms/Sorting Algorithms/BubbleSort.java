// 15 16 6 8 5
// 15 6 16 8 5      Pass 1
// 15 6 8 16 5
// 15 6 8 5 16

// 6 15 8 5 16
// 6 8 15 5 16      Pass 2 <==== here 16 is already sorted but still we  had done 4 comparisions =====>
// 6 8 5 15 16
// 6 8 5 15 16

// 6 8 5 15 16      <== 6 less than 8 no swap===>
// 6 5 8 15 16      Pass 3 <==== here 15, 16 is already sorted but still we  had done 4 comparisions =====>
// 6 5 8 15 16
// 6 5 8 15 16

// To solve these we will visit only n - 1- i in second loop

public class BubbleSort {

    //using loops
    // public static int[] sort(int arr[])
    // {
    //     int n = arr.length;
    //     for (int i = 0; i < n-1; i++) {
    //         for(int j = 0;j<n-1-i;j++)
    //         {
    //             if(arr[j]>arr[j+1])
    //             {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    //     return arr;
    // }

    //using recursion
    public static int[] sort(int arr[])
    {
       return helper(arr, arr.length,0);
    }

    public static int[] helper(int arr[], int n , int i)
    {
        if(n == 0)
        {
            return arr;
        }
        if(i<n)
        {
            if(i+1<arr.length)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            i = i+1;
        }
        else
        {
            n = n-1;
            i = 0;
        }
        return helper(arr, n, i);
    }


    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        arr = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
