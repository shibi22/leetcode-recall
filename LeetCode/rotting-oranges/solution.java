class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m =grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0 , time = 0;
        
        for(int i = 0; i < grid.length; i ++){

            for(int j = 0; j < grid[0].length; j++){
                
                if(grid[i][j] == 2){
                   queue.offer(new int[] {i,j,0});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int dr[] = {1,0,-1,0} , dx[] = {0,1,0,-1};
            int r = arr[0] , c = arr[1] , t = arr[2];
            time = Math.max(time,t);


            for(int i = 0; i < 4 ; i++){
                int newRow = r + dr[i];
                int newCol = c + dx[i];


                if(newRow >=0 && newRow < n && newCol >=0  && newCol < m && grid[newRow][newCol] == 1){
                    grid[newRow][newCol] = 2;
                    queue.offer(new int[] {newRow , newCol , t+1});
                    fresh--;

                }
            }

        }

        return fresh == 0 ? time : -1;
    }
}