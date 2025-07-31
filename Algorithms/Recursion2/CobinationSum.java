//     https://leetcode.com/problems/combination-sum/
import java.util.*;
public class CobinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> arr = new ArrayList<>();
    helper(0,candidates, target, new ArrayList<>(), arr);
    return arr;
    }

    public void helper(int i,int[] candidates, int target,ArrayList<Integer> a1, List<List<Integer>> arr)
    {
        if(i == candidates.length)
        {
            if(target == 0)
            {
                arr.add( new ArrayList<>(a1));
                return;
            }
            return;
        }
        if(candidates[i]<=target) {
            a1.add(candidates[i]);
            helper(i,candidates,target-candidates[i],a1, arr);

            a1.remove(a1.size()-1);
        }
        helper(i+1, candidates,target,a1,arr);
        return;
    }
}
