// fibonacci series starts from 0,
//0, 1, 1, 2, 3, 5, 8, 13, ....(fibonacci series)
//0, 1, 2, 3, 4, 5, 6, 7, ... (indices)
// so , it is nothing but the sum of previous 2 terms,
// so if I want to find the fibonaaci of nth term
// it should be sum of fibonaaci(n-1) and fibonacci(n-2)
// fibonaaci(n) = fibonaaci(n-1)+fibonaaci(n-2) <---- This is called as recurrence relation.



public class Fibonacii {
    public static void main(String[] args) {
        int a = fibonaci(7);
        System.out.println(a);
    }

    public static int fibonaci(int n)
    {
        // base conditions
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }
}

//The time Complexity will be 2^n.