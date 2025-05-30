public class Day3 {
    public void reverseArray(int arr[]) {
        // code here
        int j = arr.length-1;
        int i = 0; // start index
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
    }
}
