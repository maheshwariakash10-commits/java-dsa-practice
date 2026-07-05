class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        int sum= 0;

        for(int i=0 ;i< k ; i++){
            sum= sum+ nums[i];
        }
        double mx= sum;
        for(int i=1; i<= n-k; i++ ){

            // shrik
            sum= sum-nums[i-1];

            //re-expand
            sum= sum+ nums[ i+k-1];

            // max sum
            mx= Math.max(mx, sum);
        }

        return mx/k;
        
    }
}