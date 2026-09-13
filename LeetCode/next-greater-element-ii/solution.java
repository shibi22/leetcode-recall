class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        // Traverse the array twice to simulate circular behavior
        for (int i = 0; i < 2 * n; i++) {

            // Convert virtual index to actual array index
            int currentIndex = i % n;

            // Current element can resolve smaller elements
            while (!stack.isEmpty()
                    && nums[stack.peek()] < nums[currentIndex]) {

                int index = stack.pop();

                result[index] = nums[currentIndex];
            }

            // Add each actual index only once
            if (i < n) {
                stack.push(currentIndex);
            }
        }

        return result;
    }
}