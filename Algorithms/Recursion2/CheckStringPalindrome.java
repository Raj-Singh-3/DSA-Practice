public class CheckStringPalindrome {
    public static void main(String[] args) {
        String a = "jiyan";
        System.out.println(helper(a,0,a.length()-1));
    }

    public static boolean helper(String a, int i, int j)
    {
        if(i>=j) return true;
        else{
            if(a.charAt(i) == a.charAt(j))
            {
                return helper(a,i+1,j-1);
            }
            return false;
        }
    }
}
