// https://leetcode.com/problems/minimum-window-substring/
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.

import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int l = 0, r = 0, c = 0, n = s.length(), m = t.length();
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;

        HashMap<Character, Integer> ht = new HashMap<>();
        for (int i = 0; i < m; i++) {
            ht.put(t.charAt(i), ht.getOrDefault(t.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        while (r < n) {
            char ch = s.charAt(r);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (ht.containsKey(ch) && window.get(ch).intValue() <= ht.get(ch).intValue()) {
                c++;
            }

            while (c == m) {
                if ((r - l + 1) < minLength) {
                    minLength = r - l + 1;
                    startIndex = l;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);

                if (ht.containsKey(leftChar) && window.get(leftChar) < ht.get(leftChar)) {
                    c--;
                }

                l++;
            }

            r++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLength);
    }
}
