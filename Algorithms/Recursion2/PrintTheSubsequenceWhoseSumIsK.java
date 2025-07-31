import java.util.ArrayList;

// print any subsequence whose sum equlas to k
public class PrintTheSubsequenceWhoseSumIsK {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        int arr[] = {5,1,0,-1,9};
        System.out.println(helper(0, arr, 6, 0, a1));
    }

    public static  boolean helper(int i , int  arr[], int k , int sum, ArrayList<Integer> a1)
    {
        if(i == arr.length)
        {

            if(sum == k)
            {
               System.out.println(a1);
               return true;
            }
            return false;
        }
        if(i<arr.length) a1.add(arr[i]);
        boolean temp = helper(i+1,arr, k, sum + arr[i],a1);
        if(temp == true) return true;

        a1.remove(a1.size()-1);
        return helper(i+1, arr, k, sum,a1)==true?true:false;
    }
}
