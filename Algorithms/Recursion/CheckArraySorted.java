// Here we will check that the Given array is sorted or not.


public class CheckArraySorted {

    //Iterative way
    public static boolean iterativeChecker(int array[])
    {
        for (int i = 0; i < array.length; i++) {
            if(i!=array.length-1)
            {
                if(array[i]>array[i+1])
                {
                    return false;
                }
            }
        }
        return true;
    }


    // Recursive way
    public static boolean recursiveChecker(int arr[])
    {
        return helper(arr,0);
    }

    public static boolean helper(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            // if we have reach to last element means array is sorted. so , just return true
            return true;
        }
        return (arr[i]<arr[i+1])&&(helper(arr, i+1));
    }


    public static void main(String[] args) {
        int arr[]= {1,2,0,8,9,12};
        // System.out.println(iterativeChecker(arr));

        System.out.println(recursiveChecker(arr));



    }
    
}
