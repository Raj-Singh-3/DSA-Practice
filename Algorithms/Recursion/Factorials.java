/*

 Factorials are similar in concept to triangular numbers, except that multiplication is
 used instead of addition. The triangular number corresponding to nis found by
 addingnto the triangular number of n-1, while the factorial of nis found by multi
 plyingnby the factorial of n-1. That is, the fifth triangular number is 5+4+3+2+1,
 while the factorial of 5 is 5*4*3*2*1, which equals 120. Table 6.1 shows the factorials
 of the first 10 numbers.

 */
public class Factorials {

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    } 
}
