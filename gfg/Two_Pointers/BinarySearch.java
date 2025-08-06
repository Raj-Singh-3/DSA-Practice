public  class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,4,9, 34, 56, 78, 88, 89, 96};
        System.out.println("The index is: "+search(arr,3));
    }
    public static int search(int arr[], int target)
    {
        int low = 0, high = arr.length-1;
        // 0, 8 => 0 + (8-0)/2 = 4
        // 0, 4 => 0 + (4-0)/2 = 2
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}