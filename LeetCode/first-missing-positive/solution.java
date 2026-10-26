class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        boolean hasOne = false;

        for(int num : nums){
            if(num == 1){
                hasOne = true;
                break;
            }
        }

        if(!hasOne){
            return 1;
        }

         // Remove irrelevant values
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }
        
        //mark numbers that exist
         for (int i = 0; i < n; i++) {
            int value = Math.abs(nums[i]);
            int index = value - 1 ;
            nums[index] = -Math.abs(nums[index]);
        }


        //find the 1st unmarked number
         for (int i = 0; i < n; i++) {
            if(nums[i] > 0){
                return i +1;
            }
        }
            return n+1;
    }
}