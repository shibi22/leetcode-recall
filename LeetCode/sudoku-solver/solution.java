class Solution {
    public void solveSudoku(char[][] board) {

        solve(board);
    }

    private boolean solve(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {

                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (valid( row, col,num, board)){

                            board[row][col] = num;
                            
                            if(solve(board)){
                                 return true;
                            }
                        }
                        
                        board[row][col] = '.';
                    }

                    return false;
                }
            }
        }

        return true;

    }

    private boolean valid(int row, int col, char num, char[][] board) {
        for(int i =0; i < 9; i++){
            if(board[row][i] == num){
                return false;
            }
        }

         for(int i =0; i < 9; i++){
            if(board[i][col] == num){
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;


        for(int i = startRow; i < startRow +3; i++ ){
            for(int j= startCol; j < startCol+3; j++){

                 if(board[i][j] == num){
                return false;
                  }

            }
        }

        return true;
    }
}