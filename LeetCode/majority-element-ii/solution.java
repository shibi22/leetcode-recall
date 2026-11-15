class Solution {
    public List<Integer> majorityElement(int[] nums) {
        

        List<Integer> result = new ArrayList<Integer>();

        if(nums.length == 0) return result;

        int appearTimes = nums.length / 3;

        Map<Integer , Integer> frequency = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length; i++){

            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) +1);

             if(frequency.get(nums[i]) > appearTimes){
                set.add(nums[i]);
             }
        }


        for(int i : set){
            result.add(i);
        }




        return result;
    }
}