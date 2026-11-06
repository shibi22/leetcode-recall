class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        boolean[] visited = new boolean[isConnected.length];
        int count =  0;
        for(int i = 0; i < visited.length; i++){

                if(!visited[i]){
                    count++;
                    dfs(isConnected , visited , i);
                }
        }

     return count;
    }


    private void dfs(int[][] isConnected ,boolean[] visited , int i){
        
        for(int j = 0; j < isConnected[i].length; j++){
            
            if(visited[j] != true && isConnected[i][j] != 0){
                System.out.println(isConnected[i][j]);
                visited[i] = true;
                 dfs(isConnected , visited , j);
            }
        }
    }
}