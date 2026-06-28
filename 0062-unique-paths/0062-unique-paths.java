class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][]= new int [m][n];

        for(int i=0;i<n;i++){ // use column travelsel  for row
            arr[0][i]=1; // filling 1 row
        }
        for(int i=0;i<m;i++){ // use row travelsel  for col
            arr[i][0]=1;
        }

        for(int i=1;i< m;i++){// 1st rpw 
            for(int j=1;j< n;j++){// all col
                arr[i][j]= arr[i][j-1] + arr[i-1][j];
            }
        }

        return arr[m-1][n-1];

    }
}