class Solution {
    int[] dr = {1,-1,0,0};
    int[] dc = {0,0,1,-1};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int n = heights.length;
        int m = heights[0].length;

        List<List<Integer>> result = new ArrayList<>();

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        
            for(int col = 0; col < m ; col++){
                dfs(heights,0,col,pacific);
            }

            for(int row = 0; row < n; row++ ){
                 dfs(heights,row,0,pacific);
            }


            for(int col = 0; col < m ; col++){
                dfs(heights,n-1,col,atlantic);
            }

            for(int row = 0; row < n; row++ ){
                 dfs(heights,row,m-1,atlantic);
            }

            

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(pacific[i][j] && atlantic[i][j]){
                        result.add(Arrays.asList(i, j));
                    }
                }
            }
        

       return result; 
    }


   private void dfs(int[][] heights, int row, int col, boolean[][] visited) {

        int n = heights.length;
        int m = heights[0].length;
        
     if (row < 0 || row >= n || col < 0 || col >= m || visited[row][col]) {

      return;

     }
        visited[row][col] = true;

        for(int i =0; i < 4; i++){
                int newRow = dr[i] + row;
                int newCol = dc[i] + col;
                
                if(newRow < n  && newRow >= 0 && newCol >=0 && newCol < m && visited[newRow][newCol] != true && heights[newRow][newCol] >= heights[row][col]){
                
                    dfs(heights ,newRow,newCol,visited);
            }
        }
    }
}