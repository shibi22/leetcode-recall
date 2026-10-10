class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();

            if(s.length() < p.length()) return result;
            char[] b =  p.toCharArray();
            Arrays.sort(b);
        for (int i = 0; i <= s.length() - p.length(); i++){

            int right = i + p.length() - 1;
            
            String sub = s.substring(i , right +1);

            char[]  a = sub.toCharArray();


            Arrays.sort(a);


            if(Arrays.equals(a,b)){
                result.add(i);
            }

        }

         return result;
    }
}