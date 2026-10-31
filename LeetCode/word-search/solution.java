class Solution {
    public boolean exist(char[][] board, String word) {
        
        char initialChar = word.charAt(0);

            for(int i = 0; i < board.length; i++){

                for(int j = 0; j < board[0].length; j++){

                    if(board[i][j] == initialChar){

                        if(dfs(board , word , i , j, 0)){
                            return true;
                        }
                    }
                }
            }
    

        return false;
    }


    private boolean dfs(char[][] board, String word , int i , int j , int index){
        int n = board.length;
        int m = board[0].length;

        



        if(i >= n || i < 0 || j >= m || j < 0 || board[i][j] != word.charAt(index)){
            return false;
        }

                if(index == word.length() -1) return true;
                
        char temp = word.charAt(index);
        board[i][j] = '#';

        boolean found =
            dfs(board, word, i + 1, j, index + 1) ||
            dfs(board, word, i - 1, j, index + 1) ||
            dfs(board, word, i, j + 1, index + 1) ||
            dfs(board, word, i, j - 1, index + 1);

            // 6. Restore
            board[i][j] = temp;

    return found;
    }
}