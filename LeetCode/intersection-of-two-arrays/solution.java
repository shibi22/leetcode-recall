class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numsOne = new HashSet<>();
        Set<Integer> result = new HashSet<>();



        for(int num : nums1){
            numsOne.add(num);
        }


       for(int num : nums2){
        if(numsOne.contains(num)){
            result.add(num);
        }
        }

         int[] resArray = new int[result.size()];
         int index = 0;
         for(int num : result){
            resArray[index++] = num;
         }

         return resArray;

    }
}