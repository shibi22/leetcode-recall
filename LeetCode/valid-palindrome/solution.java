class Solution {
    public boolean isPalindrome(String s) {
    
    

    String clearedString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

    int left = 0 , right = clearedString.length()-1;

    while(left < right){
        
        if(clearedString.charAt(left) != clearedString.charAt(right)){
            return false;
        }

        left++;
        right--;
    }


      return true;  
    }
}