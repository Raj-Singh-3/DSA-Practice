public class Problem {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public boolean hasSameDigits(String s) {
        
        int n = s.length();
        if(n == 1)
        {
            return true;
        }
        if(n == 2)
        {
            if(s.charAt(0) == s.charAt(1))
            {
                return true;
            }
            return false;
        }
        
        while(n!=2)
        {
            String b = "";
            for(int i = 0;i<s.length()-1;i++)
            {
                int res = 0;
                res = Integer.parseInt(""+s.charAt(i)) +  Integer.parseInt(""+s.charAt(i+1));;
                res = res%10;
                b = b + res;
            }
            n = b.length();
            s = b;
        }
        return s.charAt(0) == s.charAt(1);
        
    }
}
