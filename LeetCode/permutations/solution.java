class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        ArrayList<Integer> temp = new ArrayList<>();

        permuteGenerate(result,nums,used,temp);

        return result;
    }

    private void permuteGenerate(List<List<Integer>> result,int nums[],boolean[] used,ArrayList<Integer> temp){
          
        if(temp.size() == nums.length){
            result.add(new ArrayList(temp));
            return;
        }

        for(int i = 0 ; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            permuteGenerate(result,nums,used,temp);
            used[i] = false;
            temp.remove(temp.size()-1);
        }

    }
}