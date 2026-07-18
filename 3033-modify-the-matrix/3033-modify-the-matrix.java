class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;

        int arr[][] = new int [row][col];

        for(int i=0 ;i< row ;i++){
            for(int j=0; j< col ;j++){
                if(matrix[i][j]==-1){
                    arr[i][j]= maxInCol(matrix, j);
                }
                else{
                    arr[i][j]=matrix[i][j];
                }
            }
        }
        return arr; 
        
    }
    public int maxInCol(int[][] mat, int j){
        int max=mat[0][j];

        for(int i=0; i<mat.length; i++){
            max= Math.max(max,mat[i][j]);
        }
        return max;
    }

}