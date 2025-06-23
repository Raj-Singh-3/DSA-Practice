// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/

// Given a string s consisting only of characters a, b and c.

// Return the number of substrings containing at least one occurrence of all these characters a, b and c.

public class NumberOfSubstringContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int lastSeen[] = {-1,-1,-1};// a , b, c
        int n = s.length(), count = 0;
        for(int i = 0;i<n;i++)
        {
            lastSeen[s.charAt(i)-'a'] = i;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1)
            {
               int min1= Math.min(lastSeen[0], lastSeen[1]);
               count += Math.min(min1,lastSeen[2]);
               count += 1;
            }
        }
        return count;
    }
}
