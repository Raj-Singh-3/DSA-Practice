// https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1
// You are given a string s. You have to find the length of the longest substring
// with all distinct characters.
import java.util.*;
public  class LongestSubstringWithDistinctCharacters {
    public int longestUniqueSubstr(String s) {
        // code here
        int lastIndex[] = new int[128];
        // why 128 beacuse there are 128 charcters
        // so 128 space will be considered as constant because everytime whatever the String,
        // the Space will be 128.
        Arrays.fill(lastIndex,-1);
        int maxLen = 0;
        int start = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(lastIndex[ch] >= start)
            {
                start = lastIndex[ch]+1;
            }
            lastIndex[ch] = i;
            maxLen = Math.max(maxLen,i-start+1);
        }
        return maxLen;
    }
}