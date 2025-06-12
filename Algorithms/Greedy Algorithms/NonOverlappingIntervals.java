// https://leetcode.com/problems/non-overlapping-intervals/description/
// Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

// Note that intervals which only touch at a point are non-overlapping. For example, [1, 2] and [2, 3] are non-overlapping.
import java.util.*;
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);  // sort the array on the basis of 1st index.
        
        int freetime = intervals[0][1];
        int c = 1;
        for(int i = 1;i<n;i++)
        {
            if(freetime<=intervals[i][0])
            {
                c++;
                freetime = intervals[i][1];
            }
        }
        return n-c;
    }
}
