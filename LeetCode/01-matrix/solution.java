class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int n = mat.length;
        int m  = mat[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        int[][] distance = new int[n][m];

        for(int i =0; i < n; i++){
            for(int j = 0;  j < m; j++){

                if (mat[i][j] == 1){
                    distance[i][j] = Integer.MAX_VALUE;
                }

                else{
                    distance[i][j] = 0;
                    queue.offer(new int[] {i,j});
                }
                   
            }
        }


        while(!queue.isEmpty()){
            int[] cell  = queue.poll();

            int row = cell[0];
            int col = cell[1];

            int[] dr = {-1,1,0,0};
            int[] dc = {0,0,-1,1};

            for(int k =0; k < 4; k++){
                int nextRow = row + dr[k];
                int nextCol = col + dc[k];

                if(nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m){
                    
                    if(distance[nextRow][nextCol] == Integer.MAX_VALUE){
                        distance[nextRow][nextCol] = distance[row][col] + 1;
                        queue.offer(new int[] {nextRow , nextCol});
                    }
                }
            }
        }

        return distance;
    }

}