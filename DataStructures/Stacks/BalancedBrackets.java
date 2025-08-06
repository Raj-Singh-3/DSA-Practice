import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkBrackets(s));
    }
    public static boolean checkBrackets(String a)
    {
        if(a.length()<2) return false;
        Stack<String> st = new Stack<>();
        for(int i = 0;i<a.length();i++)
        {
            if(a.charAt(i) == '(')
            {
                st.push(""+a.charAt(i));
            }
            else
            {
                if(st.size()==0)  return false;
                st.pop();
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
