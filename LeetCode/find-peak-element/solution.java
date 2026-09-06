class Solution {
    public int findPeakElement(int[] nums) {

      int peak = 0;

      for(int i = 1; i < nums.length; i++){
        
        if(nums[i] > nums[peak]){
            peak = i;
        }

      } 

      return peak;

    }
}