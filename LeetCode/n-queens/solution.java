class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, result, n);

        return result;
    }

    public void backtrack(int row, char[][] board, List<List<String>> result, int n) {

        if (row == n) {
            
            List<String> solution = new ArrayList<>();

            for(char[] resArray : board){
                solution.add(new String(resArray));
            }
            result.add(solution);
            return;
        }


        for(int col =0; col < n; col++){
            if(isValid(row,col,board)){
                board[row][col] = 'Q';
                backtrack(row +1, board, result, n);
                board[row][col] = '.';
            }
        }

    }

    private boolean isValid(int row, int col, char[][] board) {

        for (int r = row - 1; r >= 0; r--) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }

        int r = row - 1, c = col - 1;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }

            r--;
            c--;
        }

        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') {
                return false;
            }

            r--;
            c++;
        }

        return true;

    }
}