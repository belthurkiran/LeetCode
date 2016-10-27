public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates.length<1){
            return result;
        }
        Arrays.sort(candidates);
        List<Integer> curResult = new ArrayList<Integer>();
        getCombinations(candidates,result,curResult,0,target,0);
        return result;
    }
    private void getCombinations(int[] candidates,List<List<Integer>> result,List<Integer> curResult,int sum,int target,int index){
        if(sum>target){
            return;
        }
        if(sum==target){
                result.add(new ArrayList<Integer>(curResult));
        }
        for(int i=index;i<candidates.length;i++){
            curResult.add(candidates[i]);
            getCombinations(candidates,result,curResult,sum+candidates[i],target,i);
            curResult.remove(curResult.size()-1);
        }
        
    }
}
