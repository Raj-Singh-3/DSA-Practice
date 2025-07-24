public class PrintLinearlyFromNTo1 {
    public static void main(String[] args) {
        helper(10);
    }
    public static void helper(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n+" ");
        helper(n-1);
    }
}
