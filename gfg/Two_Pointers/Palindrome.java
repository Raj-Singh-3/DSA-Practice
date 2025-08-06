// https://www.geeksforgeeks.org/problems/palindrome-string0817/1

//You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a
// palindrome if it reads the same forwards and backwards.
public  class Palindrome{
    public static void main(String[] args) {
        System.out.println("Hello world");
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("madam"));
    }
    boolean isPalindrome(String s) {
        // code here
        int j = s.length()-1;
        int i = 0;
        while(i<j)
        {
           if(s.charAt(i) != s.charAt(j)) return  false;
           i++;
           j--;
        }
        return true;
    }
}
