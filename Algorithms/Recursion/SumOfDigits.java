//function(1342) = 1 + 3 + 4 + 2 = 10
// i.e function(1342) = 2 + function(134)
//     function(134) = 4 + function(13)
//     function(13) =  3 + function(1)
//     function(1) = 1 + 0;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigit(1342));
    }
    public static int sumDigit(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        int rem = n%10;
        return rem + sumDigit(n/10);
    }
}
