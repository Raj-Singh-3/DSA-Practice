import java.util.*;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> arr = new HashSet<>();
        helper(0, candidates,target,new ArrayList<>(), arr);
        return new ArrayList<>(arr);
    }
    public void helper(int i , int[] candidates, int target,ArrayList<Integer> a1, HashSet<List<Integer>> arr)
    {
        if(i == candidates.length)
        {
            if(target == 0)
            {
                Collections.sort(a1);
                arr.add(new ArrayList<>(a1));
            }
            return;
        }
        if(candidates[i]<=target)
        {
            a1.add(candidates[i]);
            helper(i+1,candidates,target-candidates[i],a1,arr);
            a1.remove(a1.size()-1);
        }
        helper(i+1,candidates,target,a1,arr);
    }
}
