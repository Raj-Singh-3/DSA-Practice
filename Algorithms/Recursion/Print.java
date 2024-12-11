// print no. from 1 to n

public class Print {
    public static void main(String[] args) {
        printing(5);
    }
    public static void printing(int n)
    {
        if(n == 0)
        {
            return;
        }
        printing(n-1);
        System.out.print(n+" ");
    }
    
}
