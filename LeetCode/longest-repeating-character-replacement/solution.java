class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int longestFrequency = 0;
        int answer = 0;


        for(int right = 0; right < s.length(); right ++){

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch , 0) + 1);
            longestFrequency = Math.max(longestFrequency , map.get(ch));


            while((right - left + 1) - longestFrequency > k){
                char currentChar = s.charAt(left);

                map.put(currentChar, map.get(currentChar) -1 );

                left++;
            }

            int window_size = right - left +1;
            answer = Math.max(answer, window_size);
        }


        return answer;

    }
}