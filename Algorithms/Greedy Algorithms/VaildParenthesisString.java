// https://leetcode.com/problems/valid-parenthesis-string/description/
// Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

// The following rules define a valid string:

// Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// Any right parenthesis ')' must have a corresponding left parenthesis '('.
// Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
public class VaildParenthesisString {
    public boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                maxOpen++;
                minOpen++;
            }
            else if(ch == ')')
            {
                maxOpen--;
                minOpen--;
            }
            else
            {
                maxOpen++;
                minOpen--;
            }
        }
        if(maxOpen<0) return false;
        if(minOpen<0) minOpen = 0;
        return minOpen == 0;
    }
}
