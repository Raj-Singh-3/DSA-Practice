import java.util.Arrays;
// 1 1 2 3 5 8 13 21
// 1 2 3 4 5 6 7  8
public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = new int[n+1];
        // System.out.println(helper(n));
        Arrays.fill(arr, -1);
        System.out.println(helper2(arr,n));
    }
    
    public static int helper(int n)
    {
        if(n<=1) return n;
        return helper(n-1)+helper(n-2);
    }

    public static int helper2(int arr[], int n)
    {
        // System.out.print(n+" ");
        if(n<=1) return arr[n] = n;
        if(arr[n]!=-1) return arr[n];
        arr[n] = helper2(arr, n-1) + helper2(arr, n-2);
        return arr[n];
    }
}
