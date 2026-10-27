class Solution {
    public int islandPerimeter(int[][] grid) {
        

        int landCells = 0;
        int sharedSides = 0;

        for (int row = 0; row < grid.length; row++) {
             for (int col = 0; col < grid[0].length; col++) {

                if (grid[row][col] == 1) {
                     landCells++;

                    if(col < grid[0].length-1){
                        if(grid[row][col+1] == 1){
                        sharedSides++;
                    }
                    }

                    if(row < grid.length-1){
                        if(grid[row+1][col] == 1){
                        sharedSides++;
                    }
                    }
                 }
             }
        }

        int answer = 4 * landCells - 2 * sharedSides;

        return answer;

    }
}