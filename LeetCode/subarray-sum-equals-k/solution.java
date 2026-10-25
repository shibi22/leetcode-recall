class Solution {
    public int subarraySum(int[] nums, int k) {
        
    Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        int count = 0;
        int prefix = 0;

       for(int num : nums){
         prefix += num;
         int required = prefix - k;

         if(map.containsKey(required)){

            count += map.get(required);
         }

         map.put(prefix , map.getOrDefault(prefix , 0) +1);
       } 

    return count;   
    }
}