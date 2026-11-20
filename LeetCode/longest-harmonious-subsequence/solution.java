class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int longestLength = 0;

        // Step 2: Check consecutive numbers
        for (int num : map.keySet()) {

            if (map.containsKey(num + 1)) {

                int length = map.get(num) + map.get(num + 1);

                longestLength = Math.max(longestLength, length);
            }
        }

        return longestLength;
    }
}