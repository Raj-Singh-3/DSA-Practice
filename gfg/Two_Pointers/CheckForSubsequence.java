// https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1
//Given two strings A and B, find if A is a subsequence of B.
// Input:
// A = AXY
// B = YADXCP
// Output: 0
// Explanation: A is not a subsequence of B as 'Y' appears before 'A'.
public class CheckForSubsequence {
    boolean isSubSequence(String A, String B) {
        int i = 0;
        int j = 0;
        int n = A.length(), m = B.length();
        while(i<n && j<m)
        {
            if(A.charAt(i) == B.charAt(j))
            {
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i == n) return true;
        return false;
    }
}