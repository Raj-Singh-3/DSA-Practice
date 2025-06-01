public class Day4 {
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        if(d>n)
        {
            d = d%n;
        }
        int i = 0, j = d-1;// reverse first d elements
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = d;
        j = n-1;
        // reversed the elements after d and including dth index.
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = n-1;
        //reverse the entire array.
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
