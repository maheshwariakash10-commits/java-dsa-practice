class Solution {
    public int[][] transpose(int[][] matrix) {
        int col= matrix[0].length;
        
        int row = matrix.length;

        int num[][]= new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                num[i][j] = matrix[j][i];
            }
        }

        return num;
        
    }
}