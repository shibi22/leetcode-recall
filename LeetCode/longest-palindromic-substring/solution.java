class Solution {

    public String longestPalindrome(String s) {
            int start = 0 , end = 0 ;

            for(int i =0; i < s.length(); i++){
                int[] odd = expand(s , i , i);
                int[] even = expand(s, i , i+1);

            // Length of odd palindrome
            int oddLength = odd[1] - odd[0] + 1;

            // Length of even palindrome
            int evenLength = even[1] - even[0] + 1;

                int currentLength = end - start + 1;

                if(oddLength > currentLength){
                   start = odd[0];
                   end = odd[1];
                }

                currentLength = end - start + 1;

                if(evenLength > currentLength){
                   start = even[0];
                   end = even[1];
                }
            }
                    return s.substring(start, end + 1);
        }



    private int[] expand(String s, int left, int right) {

        while(left >= 0 && right < s.length() && s.charAt(left) ==  s.charAt(right) ){
            left--;
            right++;
        }
     
     return new int[] {left+1 , right -1};
    }
}