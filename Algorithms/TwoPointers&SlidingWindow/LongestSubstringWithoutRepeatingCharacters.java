// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// Given a string s, find the length of the longest substring without duplicate characters.

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> ht = new HashMap<>();
        int l = 0, r = 0, maxLength = 0;
        int n = s.length();
        while(r<n)
        {
            if(!ht.containsKey(s.charAt(r)))
            {
                ht.put(s.charAt(r),r);
                maxLength = Math.max(maxLength,r-l+1);
                r++;
            }
            else{
                if(l <= ht.get(s.charAt(r))) 
                {
                    l = ht.get(s.charAt(r))+1;
                }
                maxLength = Math.max(maxLength,r-l+1);
                ht.put(s.charAt(r),r);
                r++;
            }
        }
        return maxLength;
    }
}
