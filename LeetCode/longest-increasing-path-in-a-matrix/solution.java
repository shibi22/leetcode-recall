class Solution {
    
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};

    public int longestIncreasingPath(int[][] matrix) {
        
        int logestLength = 0;
        int cache[][] = new int[matrix.length][matrix[0].length];

        for(int i  = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

               int length = dfs(i , j , matrix, cache);

               logestLength = Math.max(logestLength , length);
            }
        }


        return logestLength;
    }


    private int dfs(int i ,int j ,int[][] matrix, int cache[][] ){

        int  n =  matrix.length;
        int m = matrix[0].length;
        int longestLength = 1;

        if(cache[i][j] > 0) return  cache[i][j];
        

        for(int d = 0; d < 4; d++){

                int nextRow = i + dx[d];
                int nextCol = j + dy[d];

                if(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m && matrix[nextRow][nextCol] > matrix[i][j]){
                   int length = dfs(nextRow,nextCol,matrix,cache);
                    longestLength = Math.max(longestLength , 1 + length);
                }

              

         }

         cache[i][j] = longestLength;

        return longestLength;
    }
}