// write a proper recursive program to solve such patterns in java.
// * * * *
// * * *
// * *
// *
public class Pattern1 {


    // By using a single for loop
    // public static void printing(int n)
    // {
    //     if(n == 0)
    //     {
    //         return;
    //     }
    //     for(int i = 1;i<=n;i++)
    //     {
    //        System.out.print("* ");
    //     }
    //     System.out.println();
    //     printing(n-1);
    // }


    // Without using any single loop
    public static void printing(int n, int i)
    {
        if(n == 0)
        {
            return;
        }
        if(i<n)
        {
            System.out.print("* ");
            printing(n, i+1);
        }
        else
        {
            System.out.println();
            printing(n-1, 0);
        }
    }
    public static void main(String[] args) {
        printing(9,0);
    }
}
