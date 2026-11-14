class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(s);
        Arrays.sort(g);

            for (int i = 0; i < s.length / 2; i++) {
                int temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }

            for (int i = 0; i < g.length / 2; i++) {
                int temp = g[i];
                g[i] = g[g.length - 1 - i];
                g[g.length - 1 - i] = temp;
            }

        int counter = 0;

        for(int j = 0 ; j < s.length; j++){
            for(int i = 0; i < g.length; i++){
                if(s[j] >= g[i]){
                    g[i] = Integer.MAX_VALUE;
                    counter++;
                    break;
                }
            }
        }


        return counter ;
    }
}