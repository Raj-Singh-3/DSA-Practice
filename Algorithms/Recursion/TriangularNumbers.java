// It’s said that the Pythagorians, a band of mathematicians
//  in ancient Greece who worked under Pythagoras (of
//  Pythagorian theorem fame), felt a mystical connection
//  with the series of numbers 1, 3, 6, 10, 15, 21, … (where the
//  … means the series continues indefinitely). Can you find
//  the next member of this series


//Its an Iterative Way

/* 
int triangle(int n)
 {
 int total = 0;
 while(n > 0)           // until n is 1
 {
 total = total + n;     // add n (column height) to total--n;                // decrement column height
 }
 return total;
 }

 */



public class TriangularNumbers {
     //Its using recursion
    public static int triangle(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n+triangle(n-1);
    }

    public static void main(String[] args) {
        int a = 1000;
        System.out.println(triangle(a));
    }
}
