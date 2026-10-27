class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color) return image;
        int initialColor = image[sr][sc];
        dfs(image, sr , sc , color , initialColor);

        return image;
    }

    private void dfs(int[][] image, int row, int col, int color , int initialColor) {
        int n = image.length;
        int m = image[0].length;

        if(row >= 0 && row < n && col >= 0 && col < m && image[row][col] == initialColor){
            image[row][col] = color;


            dfs(image,row+1,col,color,initialColor); //up
            dfs(image,row,col+1,color,initialColor); // right
            dfs(image,row-1,col,color,initialColor); //down
            dfs(image,row,col-1,color,initialColor); //left


        }



    }
}