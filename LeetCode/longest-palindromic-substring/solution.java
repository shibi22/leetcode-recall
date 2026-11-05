class Solution {
    public String longestPalindrome(String s) {
          int start = 0 , end = 0;

        int maxLength = 0;
        for(int i = 0 ; i < s.length(); i++){

            int[] odd = expand(s, i ,i);
            int[] even = expand(s,i,i+1);

            int oddLength = odd[1] - odd[0] + 1;
            int evenLength = even[1] - even[0] + 1;

            if(oddLength > maxLength){
                start = odd[0];
                end = odd[1];
                 maxLength = oddLength;
               
            }

            

             if(evenLength > maxLength){
                start = even[0];
                end = even[1];
                  maxLength = evenLength;
             }

           
        }

        return s.substring(start , end+1);

    }


    private int[] expand(String s , int left , int right){

        while(left >= 0 && right < s.length() && s.charAt(left) ==  s.charAt(right)){
            left--;
            right++;
        }

        return new int[] {left +1 , right -1};
    }
}