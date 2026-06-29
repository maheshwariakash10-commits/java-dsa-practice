class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i< 9;i++){
            for(int j=0; j< 9; j++){
                if(board[i][j]!='.'){
                    char s= board[i][j]; 
                    if(isValid(board,i,j, s) == false) return false;

                }
            }
        }
        return true;
        
    }

    public boolean isValid(char[][] board , int row, int col, char s){
        int count=0;

        for(int j=0 ;j< 9 ;j++){ // column
            if(board[row][j]==s) count++;
        }
        for(int i=0 ;i< 9 ;i++){ // row 
            if(board[i][col]==s) count++;
        }


        int startRow=  (row/3)*3;
        int startCol= (col/3)*3;


        for(int i= startRow;i< startRow+3 ; i++){ // small matrix
            for(int j= startCol; j< startCol+3 ; j++ ){
                if(board[i][j]==s) count++;
            }
        }

        return count==3;

    }
}