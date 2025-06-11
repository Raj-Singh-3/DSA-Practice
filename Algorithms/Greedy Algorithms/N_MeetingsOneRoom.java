// https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
// You are given timings of n meetings in the form of (start[i], end[i]) where start[i] is the start time of meeting i and end[i] is the finish time of meeting i. Return the maximum number of meetings that can be accommodated in a single meeting room, when only one meeting can be held in the meeting room at a particular time. 

// Note: The start time of one chosen meeting can't be equal to the end time of the other chosen meeting.
import java.util.*;
public class N_MeetingsOneRoom {
    public int maxMeetings(int start[], int end[]) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int n = start.length;
        for (int index = 0; index < n; index++) {
            ArrayList<Integer> a1 = new ArrayList<>();
            a1.add(start[index]);
            a1.add(end[index]);
            arr.add(a1);
        }
        Collections.sort(arr, (a,b)->a.get(1)-b.get(1)); //if want sorting on second index.
        // Collections.sort(arr, (a,b)->a.get(0)-b.get(0));  // if want sorting on first index.
        // Collections.sort(arr, (a, b) -> a.get(0).compareTo(b.get(0))); // if it was string and want to sort on first index.
        int f = arr.get(0).get(1);
        int c = 1;
        for(int i = 1;i<n;i++)
        {
            if(f<arr.get(i).get(0))
            {
                f = arr.get(i).get(1);
                c++;
            }
        }
        return c;

    }
}
