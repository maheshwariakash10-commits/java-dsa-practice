class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col= image[0].length-1;
        int ans[][]= new int [row][col+1];

        for(int i=0 ; i< row; i++){
            int j= 0 ;
            for(int k= image[0].length-1; k>=0 ; k--){
                int ele =1^ image[i][k]; 
                ans[i][j]= ele;
                j++;
            }
        }
        return ans;

    }
}