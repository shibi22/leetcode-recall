class Solution {
    public boolean containsDuplicate(int[] nums) {
     
        // int hashMap[] = new int[nums.length];

        // int counter = 0;

        // for()


        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){

            if(map.containsKey(num)){
                return true;
            }

            else{
                map.put(num, map.getOrDefault(num , 0)+1);
            }
        }

        return false;
    }
}