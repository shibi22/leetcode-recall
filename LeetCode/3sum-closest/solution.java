class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);       
        int closestSum = 0;
        int closestDistance = Integer.MAX_VALUE;


        for(int k = 0; k < nums.length-2; k++){
            int left = k+1;
           int right = nums.length-1;
            while(left < right ){
            int sum =0;
            sum = nums[k] + nums[left] + nums[right];
            int distance = Math.abs(sum - target);

            if(distance < closestDistance ){
                closestDistance = distance;
                closestSum = sum;
            }


            if(sum > target){
                right--;
            }

            else if(sum < target){
                left++;
            }

            else {
                return sum;
            }
        }

        }

        return closestSum;
    }
}