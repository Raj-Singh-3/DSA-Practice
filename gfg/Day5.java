public class Day5 {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-2;
        while(i>=0)
        {
            if(arr[i]<arr[i+1])
            {
                break;
            }
            i--;
        }
        //search for the element in right sub -array (after i) which is just greater than arr[i].
            int j = n-1;

        if(i>=0)
        {
            while(j>i)
            {
                if(arr[j]>arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }
        i = i+1;
        j = n-1;
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
