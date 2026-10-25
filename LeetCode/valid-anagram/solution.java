class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        int hash[] = new int[125];

        for(char ch : s.toCharArray()){
            hash[ch - '0']++;
        }

         for(char ch : t.toCharArray()){
            hash[ch - '0']-- ;
        }

        for(int i = 0; i < hash.length; i++){

            if(hash[i] > 0){
                return false;
            }
        }


        return true;
    }
}