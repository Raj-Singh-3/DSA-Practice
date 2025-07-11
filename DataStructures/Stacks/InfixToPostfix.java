// https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1
// Given an infix expression in the form of string s. Convert this infix expression to a postfix expression.

// Infix expression: The expression of the form a op b. When an operator is in between every pair of operands.
// Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
// Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -. Ignore the right associativity of ^.
import java.util.*;
public class InfixToPostfix {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        HashMap<Character,Integer> ht = new HashMap<>();
        ht.put('+',1);
        ht.put('-',1);
        ht.put('*',2);
        ht.put('/',2);
        ht.put('^',3);
        int i = 0, n = s.length();
        String ans = "";
        while(i<n)
        {
            char ch = s.charAt(i);
            if((ch>='a' &&ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9'))
            {
                ans += ch;
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch == ')')
            {
                while(st.size()>0 && st.peek()!='(')
                {
                    ans += st.peek();
                    st.pop();
                }
                st.pop();// to remove '(';
            }
            else
            {
                while(st.size()>0 && ht.getOrDefault(st.peek(), -1)
>=ht.get(ch))
                {
                    ans += st.pop();
                }
                st.push(ch);
            }
            i++;
        }
        while(st.size()>0)
        {
            ans += st.pop();
        }
        return ans;
    }
}
