class Solution {
    public int longestPalindrome(String s) {

        int[] hash = new int[128];

        for (char c : s.toCharArray()) {
            hash[c]++;
        }

        int result = 0;
        boolean hasOdd = false;

        for (int count : hash) {

            result += (count / 2) * 2;

            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        if (hasOdd) {
            result++;
        }

        return result;
    }
}