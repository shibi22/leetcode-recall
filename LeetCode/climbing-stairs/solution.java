class Solution {
    public int climbStairs(int n) {
        
        if(n <=2) return n ;

        int past = 1;
        int prev = 2;
        int current = 0;

        for(int i = 2; i <n; i++){
            current = past + prev;
            past = prev;
            prev = current;
        }

        return current;
    }
}