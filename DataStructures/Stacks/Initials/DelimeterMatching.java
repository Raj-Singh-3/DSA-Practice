 /* 
 One common use for stacks is to parse certain kinds of text strings. Typically, the
 strings are lines of code in a computer language, and the programs parsing them are
 compilers.
 To give the flavor of what’s involved, we’ll show a program that checks the delimiters 
 in a line of text typed by the user. This text doesn’t need to be a line of real Java
 code (although it could be), but it should use delimiters the same way Java does. The
 delimiters are the braces { and }, brackets [ and ], and parentheses ( and ). Each
 opening or left delimiter should be matched by a closing or right delimiter; that is,
 every { should be followed by a matching } and so on. Also, opening delimiters that
 occur later in the string should be closed before those occurring earlier. Here are
 some examples:
 c[d]        // correct
 a{b[c]d}e   // correct
 a{b(c]d}e   // not correct; ] doesn’t match (
 a[b{c}d]e}  // not correct; nothing matches final }
 a{b(c)      // not correct; nothing matches opening 

*/

class BracketChecker {
    String input;
    int maxSize;

    public BracketChecker(String s) {
        input = s;
        maxSize = input.length();
    }

    public boolean check() {
        StackCharacter st = new StackCharacter(maxSize);
        for (int i = 0; i < maxSize; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    st.push(ch);
                    break;
                case ']':
                case '}':
                case ')':
                    if (!st.isEmpty()) {
                        char chx = st.pop();
                        if ((ch == ']' && chx != '[') ||
                            (ch == '}' && chx != '{') ||
                            (ch == ')' && chx != '(')) {
                            System.out.println("Error: Mismatched bracket at position " + i);
                            return false;
                        }
                    } else {
                        System.out.println("Error: Closing bracket without opening at position " + i);
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        if (!st.isEmpty()) {
            System.out.println("Error: Unmatched opening brackets remaining");
            return false;
        }
        return true;
    }
}

public class DelimeterMatching {
    public static void main(String[] args) {
        String s = "a[b{c}d]e} ";
        BracketChecker br = new BracketChecker(s);
        br.check();
    }
}
