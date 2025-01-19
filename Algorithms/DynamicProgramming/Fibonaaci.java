public class Fibonaaci{
    //------------------> Without DP<-----------------------

    public static int fib(int n)
    {
        int a1 = 0;
        int a2 = 1;
        if(n == 0)
        {
            return a1;
        }
        else if(n == 1)
        {
            return a2;
        }
        else
        {
            int sum = 0;
            for(int i = 1;i<n;i++)
            {
                sum = a2 + a1;
                a1 = a2;
                a2 = sum;
            }
            return sum;
        }
    }

    // It was a top Down Approach
    public static int fibWithDp(int n, int arr[])
    {
        if(n<=1)
        {
            //hum har ek nth fibonacci pe uski value store karenge
            arr[n] = n;
            return arr[n];
        }
        if(arr[n]!=-1)
        {
            //agar wo humare pass store hai to
            return arr[n];
        }
        // agar store nahi hai to claculate katrenge
        arr[n] = fibWithDp(n-1, arr) + fibWithDp(n-2, arr);
        return arr[n];
    }

    //It will be a bottom up approach
    public static int dpBottomUp(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<=n;i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        // ********************for without dp*****************
        // fib(5);

        //**************** for dp of top-down***************
        // int n = 7;
        // int arr[] = new int[n+1];
        // Arrays.fill(arr, -1);
        // System.out.println(fibWithDp(n, arr));

        //************for bottom up dp ********************
        System.out.println(dpBottomUp(7));



    }
}