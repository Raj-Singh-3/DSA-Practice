// https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
// Given a string s and an integer k, return the length of the longest substring of s such that the
// frequency of each character in this substring is greater than or equal to k.
//if no such substring exists, return 0.
import java.util.*;
public class LongestSubstring_with_Atleast_K_RepeatingCharacters {
    public int longestSubstring(String s, int k) {
        HashMap<Character, Integer> ht = new HashMap<>();
        int n = s.length();
        boolean flag = false;
        int start = 0, int maxLength = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ht.containsKey(ch)&& ht.get(ch)>=k)
            {
                flag = true;
            }
            ht.put(ch,ht.getOrDefault(ch,0)+1);
            boolean flag2 = false;
            if(flag)
            {
                flag = false;
                for(var e: ht.entrySet())
                {
                    char c = e.getKey();
                    if(ht.get(c)<k){
                        flag2 = true;
                        break;
                    }
                }
            }
            if(flag2 == false)
            {
                maxLength = Math.max(maxLength,i-start+1);
            }
        }
        return maxLength;
    }
}