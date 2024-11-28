
// This class will reverse the string.
class Reverser{
    String input = "";
    String output = "";
    public Reverser(String s)
    {
        this.input = s;
    }

    public String reverse()
    {
        StackCharacter s = new StackCharacter(input.length()+1);
        for (int i = 0; i < input.length(); i++) {
            s.push(input.charAt(i)); // inserting every character of a string into the stack.
        }

        while(!s.isEmpty()){
            char ch = s.pop();
            output += ch;
        }
        return output;
    }
}


public class ReverseString {
    public static void main(String[] args) {
        String word = "halwa";
        Reverser r = new Reverser(word);
        System.out.println(r.reverse());
    }
}
