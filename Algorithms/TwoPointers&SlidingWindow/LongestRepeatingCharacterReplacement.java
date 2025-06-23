// https://leetcode.com/problems/longest-repeating-character-replacement/description/
// You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the above operations.

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> ht = new HashMap<>();
        int l = 0, maxFreq = 0, maxLength = 0;

        for (int r = 0; r < s.length(); r++) {
            ht.put(s.charAt(r), ht.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, ht.get(s.charAt(r)));

            if ((r - l + 1) - maxFreq > k) {
                ht.put(s.charAt(l), ht.get(s.charAt(l)) - 1);
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}

}
