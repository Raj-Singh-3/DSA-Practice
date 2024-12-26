// here we assume that the left side part is already sorted.
// from the unsorted sub array , find the minimum number and replace with the current index.
// or we can search for maximum element and put it in the last index of an array.
public class SelectionSort {

    // <================== Without Recursion =======================>
    // public static void sort(int arr[])
    // {
    //     for (int i = 0; i < arr.length; i++) {
    //         int min = i;
    //         for(int j = i+1;j<arr.length;j++)
    //         {
    //             // we will find minimum number than the current number that is at index i.
    //             if(arr[min]>arr[j])
    //             {
    //                 min = j;
    //             }
    //         }
    //         // agar mera min ki value and i ki value same nahi hai iska matlab unsorted array me ek element exist karta hai which is smaller than the element at i.
    //         if(i!=min)
    //         {
    //             int temp = arr[i];
    //             arr[i] = arr[min];
    //             arr[min] = temp;
    //         }
    //     }
    // }




    // With Recursion
    public static void sort(int arr[])
    {
        helper(arr, arr.length, 0 , 0);
    }

    // public static void helper(int arr[], int n, int i, int minIndex) {
    //     if(n == 0)
    //     {
    //         return;
    //     }
    //     if(i<n)
    //     {
    //         if(arr[i]<arr[minIndex])
    //         {
    //             minIndex = i;
    //         }
    //         helper(arr, n, i+1, minIndex);
    //     }
    //     else
    //     {
    //         int z = arr.length - n;
    //         int temp = arr[z];
    //         arr[z] = arr[minIndex];
    //         arr[minIndex] = temp;            
    //         n = n-1;
    //         i = 0;
    //         minIndex = 0;
    //         helper(arr, n, i, minIndex);
    //     }
        
    // }


    public static void helper(int arr[], int n, int i, int minIndex) {
        if (n == 0) {
            return; // Base case: no elements left to sort
        }

        if (i < n) {
            // Find the index of the minimum element in the current range
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            helper(arr, n, i + 1, minIndex); // Continue searching for the minimum
        } else {
            // Swap the minimum element with the first element in the current range
            int z = arr.length - n;
            int temp = arr[z];
            arr[z] = arr[minIndex];
            arr[minIndex] = temp;

            // Proceed to the next range
            helper(arr, n - 1, z + 1, z + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
