// https://leetcode.com/problems/valid-parentheses/description/

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

import java.util.*;
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch=='[')
            {
                stack.push(ch);
            }
            else if(stack.size()>0 && ch == ')'&& stack.peek() =='(')
            {
                stack.pop();
            }
            else if(stack.size()>0 && ch == '}'&& stack.peek() =='{')
            {
                stack.pop();
            }
            else if(stack.size()>0 && ch == ']'&& stack.peek() =='[')
            {
                stack.pop();
            }
            else
            {
                return false;
            }
        }
        return stack.size() == 0;
    }
}

