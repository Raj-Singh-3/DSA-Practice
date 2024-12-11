// 5 4 3 2 1

public class ReversePrint {
    public static void main(String[] args) {
        reversePrinting(5);
    }

    public static void reversePrinting(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");// First it will print a number
        reversePrinting(n-1); // After that it will call itself with n-1
    }
}
