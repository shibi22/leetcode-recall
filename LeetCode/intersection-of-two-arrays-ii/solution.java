class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums1){

            if(frequency.containsKey(num)){
                frequency.put(num , frequency.get(num) +1 );
            }

            else{
                frequency.put(num , 1);
            }
        }


        for(int num : nums2){
            if(frequency.containsKey(num) && frequency.get(num) > 0){
                result.add(num);
                frequency.put(num , frequency.get(num) -1 );
            }
        }

        int[] resArray = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            resArray[i] = result.get(i);
        }
      return resArray;
    }
}