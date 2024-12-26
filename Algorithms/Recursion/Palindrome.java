public class Palindrome {
    public static int rev(int n)
    {
        int digit = (int)Math.log10(n)+1; // It will count no. of digits in a number
        return reverse(n, digit);
    }
    public static int reverse(int n , int digit)
    {
        if(n == 0)
        {
            return 0;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10, digit-1) + reverse(n/10, digit-1);
    }

    public static boolean isPalindrome(int n)
    {
        int j = rev(n); // It will return the reverse of a number.
        return n == j;
    }
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(isPalindrome(n));
        
    }
}
