// https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1

//Given a array arr of integers, return the sums of all subsets in the list.  Return the sums in any order.
//
//Examples:
//
//Input: arr[] = [2, 3]
//Output: [0, 2, 3, 5]
//Explanation: When no elements are taken then Sum = 0. When only 2 is taken then Sum = 2. When only 3 is taken then Sum = 3. When elements 2 and 3 are taken then Sum = 2+3 = 5.
//Input: arr[] = [1, 2, 1]
//Output: [0, 1, 1, 2, 2, 3, 3, 4]
//Explanation: The possible subset sums are 0 (no elements), 1 (either of the 1's), 2 (the element 2), and their combinations.
//Input: arr[] = [5, 6, 7]
//Output: [0, 5, 6, 7, 11, 12, 13, 18]
//Explanation: The possible subset sums are 0 (no elements), 5, 6, 7, and their combinations.


import java.util.ArrayList;

public class SubSetSumProblem {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> a1 = new ArrayList<>();
        helper(0,arr,0,a1);
        return a1;
    }
    public void helper(int i, int[] arr,int sum, ArrayList<Integer> a1)
    {
        if(i == arr.length)
        {
            a1.add(sum);
            return;
        }
        sum += arr[i];
        helper(i+1,arr,sum,a1);
        sum-=arr[i];
        helper(i+1,arr,sum,a1);
    }
}
