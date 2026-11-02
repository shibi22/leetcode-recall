class Solution {
    public boolean validPalindrome(String s) {
        

        int left = 0 , right = s.length()-1;

            while(left < right) {

                if(s.charAt(left) == s.charAt(right)) {

                    left++;
                    right--;

                 } else {

                    boolean leftcheck = isPalindrome(s, left + 1, right);

                    boolean  rightcheck =  isPalindrome(s, left, right - 1);

                            return leftcheck || rightcheck;
                }
            }


        return true;
    }


    private boolean isPalindrome(String s, int left, int right) {

    while(left < right) {

        if(s.charAt(left) != s.charAt(right)) {
           return  false;
        }

        left++;
        right --;
    }


    return true;

    }
}