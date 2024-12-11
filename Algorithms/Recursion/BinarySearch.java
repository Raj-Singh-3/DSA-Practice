public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,8, 12, 17, 89, 103, 109};
        int lower = 0;
        int upper = arr.length-1;
        int a = binarySearch(arr,lower,upper, 80);
        System.out.println(a);
    }

    public static int binarySearch(int arr[], int lower, int upper, int key)
    {
        if(lower>upper)
        {
            return -1;
        }
        int mid = lower+ (upper - lower)/2;
        if(arr[mid]<key)
        {
            return binarySearch(arr, mid+1, upper, key);
        }
        else if(arr[mid]>key)
        {
            return binarySearch(arr, lower, mid-1 ,key);
        }
        return mid;
    }
}
