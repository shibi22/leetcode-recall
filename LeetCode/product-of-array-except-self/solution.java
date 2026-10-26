class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        if (n == 0) return result;
        if (n == 1) {
            result[0] = 1;
            return result;
        }

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= nums[i];
            leftProduct[i] = product;
        }

        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product *= nums[i];
            rightProduct[i] = product;
        }

        result[0] = rightProduct[1];
        result[n - 1] = leftProduct[n - 2];

        for (int i = 1; i < n - 1; i++) {
            result[i] = leftProduct[i - 1] * rightProduct[i + 1];
        }

        return result;
    }
}