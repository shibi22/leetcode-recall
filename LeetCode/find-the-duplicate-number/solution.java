class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;

        while(nums[i] < n){

            if(nums[i] == nums[nums[i]]){
                return nums[i];
            }

            else{
                int temp = nums[i];
                nums[i]  = nums[temp];
                nums[temp] = temp;
            }
        }

        return -1;

    }
}