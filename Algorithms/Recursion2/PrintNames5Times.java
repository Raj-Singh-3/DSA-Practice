// you have to print your name for 5 times.
public class PrintNames5Times
{
    public static void main(String[] args) {
        helper(5);
    }
    public static  void helper(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println("John Doe");
        helper(n-1);
    }
}