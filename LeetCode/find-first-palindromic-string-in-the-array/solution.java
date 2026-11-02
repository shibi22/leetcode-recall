class Solution {
   
    public String firstPalindrome(String[] words) {
        
        for(int i = 0; i < words.length; i++){

            char[] ch = words[i].toCharArray();

            int left = 0 , right = ch.length-1;

             boolean palindrome = true;
            while(left < right){

                if(ch[left] != ch[right]){
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if(palindrome){
                return words[i];
            }
        }

        return "";
    }
}