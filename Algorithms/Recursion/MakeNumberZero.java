// here we have to make a number zero in some steps
// with some condition like if it is even divide by 2 else subtract 1 from that number. 
// for example:
//  14
//  14 becomes 7 , since it is even, c = 1
//  7 becomes 6, it is odd,c = 2
//  6 -->3, even, c= 3
//  3 -->2, odd, c=4
//  2 -->1, even, c= 5
//  1 -->0, odd, c= 6


public class MakeNumberZero {
    public static int helper(int n)
    {
        return stepsRequireToMakeZero(n,0);
    }
    
    public static int stepsRequireToMakeZero(int n, int c){
        if(n == 0)
        {
            return c;
        }

        if(n%2 == 0)
        {
            n = n/2;
            c++;
        }
        else
        {
            n = n -1;
            c++;
        }
        return stepsRequireToMakeZero(n, c);
    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(helper(n));
    }
}
