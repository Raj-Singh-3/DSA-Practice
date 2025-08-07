//  https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
// You are given a string s consisting only lowercase alphabets and an integer k.
// Your task is to find the length of the longest substring that contains exactly k distinct characters.
//Note : If no such substring exists, return -1.

public  class LongestSubstringwithKUniques {
    public int longestKSubstr(String s, int k) {
        HashMap<Character, Integer> ht = new HashMap<>();
        int maxLength = -1, start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ht.put(ch, ht.getOrDefault(ch, 0) + 1);

            // Shrink window if more than k distinct characters
            while (ht.size() > k) {
                char leftChar = s.charAt(start);
                ht.put(leftChar, ht.get(leftChar) - 1);
                if (ht.get(leftChar) == 0) {
                    ht.remove(leftChar);
                }
                start++;
            }

            // Update maxLength when exactly k distinct characters
            if (ht.size() == k) {
                maxLength = Math.max(maxLength, i - start + 1);
            }
        }

        return maxLength;
    }
}