// Here , we will gonna peform linear search on an array using recusion.

import java.util.ArrayList;

public class LinearSearch {


// <=================================It will give the first value or indice of target ===========================>

    // public static int search(int arr[], int target)
    // {
    //     return helper(arr, target,0);
    // }

    // public static int helper(int arr[], int target, int i)
    // {
    //     if(i == arr.length-1)
    //     {
    //         if(arr[i] == target)
    //         {
    //             return i;
    //         }
    //         return -1;
    //     }
    //     if(arr[i]== target)
    //     {
    //         return i;
    //     }
    //     return helper(arr, target, i+1);
    // }








    // <=================================It will give all the  value or indice of target ===========================>

    // public static void helper(int arr[], int target, int i,ArrayList<Integer> arr1)
    // {
    //     if(i == arr.length-1)
    //     {
    //         if(arr[i] == target)
    //         {
    //             arr1.add(i);
    //         }
    //         return;
    //     }
    //     if(arr[i]== target)
    //     {
    //         arr1.add(i);
    //     }
    //     helper(arr, target, i+1, arr1);
    // }

    // public static void search(int arr[], int target,ArrayList<Integer> arr1)
    // {
    //     helper(arr, target,0 ,arr1);
    // }









//<================ It will give the list of all the indices that matches with target but without having arraylist as parameter===========>
    public static ArrayList<Integer> helper(int arr[], int target, int i)
    {
        ArrayList<Integer> arr1 = new ArrayList<>();
        if(i == arr.length-1)
        {
            if(arr[i] == target)
            {
                arr1.add(i);
            }
            return arr1;
        }
        if(arr[i]== target)
        {
            arr1.add(i);
        }
        arr1.addAll(helper(arr, target, i+1));
        return arr1;
    }
// In the above function we arecreating a new arraylist each time and stores the integer if it matches with target element.
// when the last call ends and returns the arraylist all the previous function calls are adding their values over here.
//That's why at the end the arraylist that we got ,has all the indices of each target element present in an array.
    public static ArrayList<Integer> search(int arr[], int target)
    {
        return helper(arr, target,0 );
    }

    
    public static void main(String[] args) {
        int arr[] = {1,2,9,8,67 ,23, 0};
        // System.out.println(search(arr, 67));
        // ArrayList <Integer> arr1 = new ArrayList<>();


        ArrayList<Integer> arr1=search(arr, 67);
        System.out.println(arr1);
    }
}
