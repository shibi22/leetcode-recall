class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
         int i = 0;

         while(i < n ){
            if(nums[i] < n && nums[i] != nums[nums[i]]){
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }

            else{
                i++;
            }
         }

         for(int find_mising_number = 0 ; find_mising_number < n; find_mising_number++ ){
            if(nums[find_mising_number] != find_mising_number){
                return find_mising_number;
            }
         }

         return n;
    }
}