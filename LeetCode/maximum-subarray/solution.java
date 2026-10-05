class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=nums[0];
        int currentMax=0;

        for(int num : nums){

            if(currentMax < 0){
                currentMax=0;
            }

            currentMax += num;
            max =  Math.max(max ,currentMax );
        }


        return max;
    }
}