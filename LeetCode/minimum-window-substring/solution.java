class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()) return "";


        int left = 0 , start = 0 , minLen = Integer.MAX_VALUE;

        int[] windowFreq = new int[128];
        int[] tFreq = new int[128];

        for(char ch : t.toCharArray()){
            tFreq[ch]++;
        }

        for(int right = 0; right < s.length(); right++){

            windowFreq[s.charAt(right)]++;

            while(containsAll(windowFreq , tFreq)){
                int currentLength = right - left +1;
                if(currentLength < minLen){
                    minLen = currentLength;
                    start = left;
                }

                windowFreq[s.charAt(left)]--;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start , start+minLen);

    }

        private boolean containsAll( int[] windowFreq ,int[] tFreq){

        for(int i = 0 ; i < 128; i++){
            if(windowFreq[i] < tFreq[i]) return false;
        }

        return true;
    }
}