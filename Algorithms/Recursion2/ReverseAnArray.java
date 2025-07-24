public class ReverseAnArray{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        for (int i : arr) {
           System.out.print(i+""); 
        }
        System.out.println();
        helper(arr, 0, arr.length-1);
        for (int i : arr) {
           System.out.print(i+""); 
        }
    }
    public static void helper(int arr[], int i , int j)
    {
        if(i<j)
        {
            int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           helper(arr,i+1,j-1);
        }
    }
}