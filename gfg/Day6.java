import java.util.*;

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        HashMap<Integer, Integer> ht = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            if(ht.containsKey(nums[i]))
            {
                ht.put(nums[i],ht.get(nums[i])+1);
            }
            else
            {
                 ht.put(nums[i],1);
            }
        }
        int k = n/3;
        List<Integer> arr = new ArrayList<Integer>();
        for(var e: ht.entrySet())
        {
            if(e.getValue()>k)
            {
                arr.add(e.getKey());
            }
        }
        Collections.sort(arr); // at max two elements. 
        return arr;
    }
}




public class Day6 {

    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> arr  = new ArrayList<Integer>();
        int c1 = -1, c2 = -1, count1 = 0, count2 = 0;
        int n = nums.length;
        for(int num: nums)
        {
            if(c1 == num)
            {
               count1 += 1 ;
            }
            else if(c2 == num)
            {
               count2 += 1 ;
            }
            else if(count1 == 0)
            {
                c1 = num;
                count1 = 1 ;
            }
            else if(count2 == 0)
            {
                c2 = num;
                count2 = 1 ;
            }
            else
            {
               count1--;
               count2--;
            }
        }
        // validating that the candidates we got are really greter than n/3 or not?
        int x1 = 0, x2 = 0;
        for(int num: nums)
        {
           if(c1 == num) x1++;
           else if(c2 == num) x2++;
        }
        int threshold = n/3;
        if(x1>threshold) arr.add(c1);
        if(x2>threshold) arr.add(c2);
        Collections.sort(arr);
        return arr;
        
    }
    
}



