// function(1300980)----->3


public class CountZeroes {
    public static int counting(int n, int c)
    {
        if(n == 0)
        {
            return c;
        }
        int rem = n%10;
        if(rem == 0)
        {
            return counting(n/10,c+1);
            // return counting(n/10,c+++) ---------------> will lead to incorrect answer, the value will always be zero.
        }
        return counting(n/10, c);
    }
    public static void main(String[] args) {
        System.out.println(counting(1300980, 0)); //3
    }
}
