class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);


        int logestCount = 0;

        for(int num : set){
            int currentCount = 0;

            if(!set.contains(num -1)){
                int j = num;
                while(set.contains(j)){
                    currentCount++;
                    j++;
                }
                logestCount = Math.max(logestCount ,currentCount);
            }
        }

        return logestCount;
    }
}