// Reverse a number using recursion

public class ReverseNumber {


    // First way to make a number reverse using extra class variable named as 'sum'
    // static int sum = 0;
    // public static void reverse(int n)
    // {
    //     if(n == 0)
    //     {
    //         return;
    //     }
    //     int rem = n%10;
    //     sum = sum* 10 + rem;
    //     reverse(n/10);
    // }


    //The second way is to pass the digit of that no.


    public static int reverse(int n , int digit)
    {
        if(n == 0)
        {
            return 0;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10, digit-1) + reverse(n/10, digit-1);
    }

    public static void main(String[] args) {


        // <======================It was For first way--------------------------------------->
        // reverse(5876);
        // System.out.println(sum);


         // <======================It was For Second way--------------------------------------->
        System.out.println(reverse(12345,5));

    }

    
}
