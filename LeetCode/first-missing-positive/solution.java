class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        boolean hasOne = false;

       for(int num : nums){

            if(num ==1){
                hasOne = true;
            }

        } if(!hasOne) return 1;

        
        //remove irrelent elements

        for(int i = 0 ; i < nums.length; i++){

            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = 1;
            }
        }


        //scan the array to mark the correct elements


        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            int index = Math.abs(value) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
      
            //scan the array to find the missing posstive integer
       for(int i = 0 ; i < nums.length; i++){

            if(nums[i] > 0){
                return i +1;
            }
        
        }

      return n + 1;    

    }
}