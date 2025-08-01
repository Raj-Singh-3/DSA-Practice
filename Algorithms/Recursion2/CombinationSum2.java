import java.util.*;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, candidates,target,new ArrayList<>(), arr);
        return arr;
    }
    public void helper(int start , int[] candidates, int target,ArrayList<Integer> a1, List<List<Integer>> arr)
    {
        if(target == 0)
        {
            arr.add(new ArrayList<>(a1));
            return;
        }
        for(int i = start;i<candidates.length;i++)
        {
            if(i>start && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            a1.add(candidates[i]);
            helper(i+1,candidates,target-candidates[i],a1,arr);

            a1.remove(a1.size()-1);
            helper(i+1, candidates,target,a1,arr);
        }
    }
}
