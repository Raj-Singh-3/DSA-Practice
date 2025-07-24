import java.util.*;
public class PrintSubsequence {
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,9};
        printer(0,arr,new ArrayList<>());
    }
    public static void printer(int i, int arr[], ArrayList<Integer> l1)
    {
        if(i>=arr.length)
        {
            System.out.println(l1);
            return;
        }
        l1.add(arr[i]);
        printer(i+1, arr, l1);// pick case
        l1.remove(l1.size()-1);
        printer(i+1,arr,l1); // not pick case
    }
    
}
