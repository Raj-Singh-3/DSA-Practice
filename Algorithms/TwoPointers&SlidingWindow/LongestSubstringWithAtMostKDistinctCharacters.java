// https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

// Given a string s, you need to print the size of the longest possible substring with exactly k unique characters. If no possible substring exists, print -1.

import java.util.HashMap;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> ht = new HashMap<>();
        int l = 0, r = 0, n = s.length(), maxLength = -1;
        while(r<n){
            ht.put(s.charAt(r),ht.getOrDefault(s.charAt(r), 0)+1);
            if(ht.size()>k)
            {
                ht.put(s.charAt(l),ht.get(s.charAt(l))-1);
                if(ht.get(s.charAt(l))== 0)
                {
                    ht.remove(s.charAt(l));
                }
                l++;
            }
            if(ht.size()==k)
            {
                int length = r-l+1;
                maxLength = Math.max(maxLength,length);
            }
            r++;
        }
        return maxLength;
    }
}
