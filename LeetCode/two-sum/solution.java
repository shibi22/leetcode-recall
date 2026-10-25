class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int result[] = new int[2];
        //target - i = result
        // result + i = target
        for(int i = 0 ; i < nums.length; i++){

            int balance = target - nums[i];

            if(map.containsKey(balance)){
                result[0] = map.get(balance);
                result[1] = i;
            }

            else{
                map.put(nums[i] , i);
            }
        }


        return result;
    }
}