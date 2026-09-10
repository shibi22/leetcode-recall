class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int result[] = new int[n -k +1];
        int ri = 0;


            for(int i =0; i<n; i++){
            
            while (!dq.isEmpty() && dq.peek() <i -k +1){
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
         }
            dq.offerLast(i);


            if(i >= k -1 ){
                result[ri++]= nums[dq.peekFirst()];
            }
    
            }

            return result;        
    }

}