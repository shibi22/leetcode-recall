class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasOdd = false;
        boolean hasEven = false;
        int min  = nums1[0];

        for(int num : nums1){
            if(num % 2 == 0){
                hasEven = true;
            }

            else{
                hasOdd= true;
            }

            min = Math.min(min , num);
           
        }

         if(!hasEven || !hasOdd){
                    return true;
            }

        return min % 2 != 0;
    }
}