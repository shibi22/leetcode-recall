class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
       List<Integer> path = new ArrayList<>();
       int remaining = target;
        backtrack(0 , path , remaining, result,candidates);
        return result;
    }

     private void backtrack(int pos , List<Integer> path , int remaining, List<List<Integer>>  result, int[] candidates) {

        Arrays.sort(candidates);
        if(remaining == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        
        for(int i = pos; i < candidates.length; i ++){
            
             // duplicate handling
            if (i > pos && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // impossible candidate handling
            if (candidates[i] > remaining) {
                break;
            }
            
            
            path.add(candidates[i]);
            backtrack(i+1, path,remaining -candidates[i] ,result,candidates);
            path.remove(path.size()-1);
        }
    }
}
