public class Day1 {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 1;i<n;i++)
        {
            if(largest<arr[i])
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(secondLargest<arr[i] && largest>arr[i])
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
        
    }
}

