public class SumOfSubsequenceEqualsToK {
    public static void main(String[] args) {
        int arr[] = {5,1,0,-1,9};
        System.out.println(helper(0, arr, 8, 0));
    }
    public static  boolean helper(int i , int  arr[], int k , int sum)
    {
        if(i == arr.length)
        {
            return sum == k? true: false;
        }
        return  helper(i+1,arr, k, sum + arr[i]) || helper(i+1, arr, k, sum);
    }
}
