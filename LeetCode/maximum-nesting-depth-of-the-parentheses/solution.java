class Solution {
    public int maxDepth(String s) {
        int depth = 0 , Maxdepth =0;


        for(int i = 0; i < s.length() ; i ++){
            
            char ch = s.charAt(i);
            
            if(ch == '('){
                depth++;
                Maxdepth = Math.max(Maxdepth , depth);
            }

            else if(ch == ')'){
                depth--;
            }
        }

        return Maxdepth;
    }
}