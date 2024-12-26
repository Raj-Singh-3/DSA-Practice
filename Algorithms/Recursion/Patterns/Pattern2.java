// write a proper recursive program to solve such patterns in java.
// *
// * *
// * * *
// * * * *

public class Pattern2 {


    // By using a single for loop
    public static void printing(int n)
    {
        if(n == 0)
        {
            return;
        }
        printing(n-1);
        for(int i = 1;i<=n;i++)
        {
           System.out.print("* ");
        }
        System.out.println();
    }


    // Without using any single loop
    public static void printing(int n, int i)
    {
        if(n == 0)
        {
            return;
        }
        if(i<n)
        {
            printing(n, i+1);
            System.out.print("* ");
        }
        else
        {
            printing(n-1, 0);
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        // printing(9);
        printing(4,0);
    }
}
