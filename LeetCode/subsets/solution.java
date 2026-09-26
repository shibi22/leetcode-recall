class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       ArrayList<List<Integer>> result = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();
       backtracking(result , nums , 0 ,temp );

       return result;
    }

    private void backtracking(ArrayList<List<Integer>> result , int[] nums , int pos ,ArrayList<Integer> temp ){
        result.add(new ArrayList<>(temp));
        for(int i = pos ; i < nums.length; i++){
            temp.add(nums[i]);
            backtracking(result , nums , i +1 ,temp );
            temp.remove(temp.size()-1);
        }
    }
}