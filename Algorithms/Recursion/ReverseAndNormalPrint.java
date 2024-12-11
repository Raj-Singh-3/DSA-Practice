// 5 4 3 2 1 1 2 3 4 5

public class ReverseAndNormalPrint {
    public static void main(String[] args) {
        printing(5);
    }
    public static void printing(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n+" ");
        printing(n-1);
        System.out.print(n+" ");
    }
}
