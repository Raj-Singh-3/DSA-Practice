public class RotatedBinarySearch {

    public static int search(int arr[], int low, int end, int key)
    {

        if(low>end)
        {
            return -1;
        }
        //middle element find kiya
        int mid = low +(end-low)/2;
        if(arr[mid] == key)
        {
            return mid;
        }

        //iska matlab array sorted hai mid element tak
        if(arr[low]<=arr[mid])
        {
            // agar sorted hai to 'low' se lekar 'mid' tak ke bich me 'key' exist karta hai kya?
            if(key>=arr[low] && key<=arr[mid])
            {
                end = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        // iska matlab ki sorted nahi hai to hum check karenge ki mid se lekar 'end' tak key exixt karta hai kya?
        else if(key>=arr[mid] && key<=arr[end])
        {
            low = mid+1;
        }
        // aur agar nahi karta to ye condition satisfy hogi..
        else
        {
            end = mid-1;
        }
        return search(arr, low, end, key);

    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 0, arr.length-1, 87));
    }
}
