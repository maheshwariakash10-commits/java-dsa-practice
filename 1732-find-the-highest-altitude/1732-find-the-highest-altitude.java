class Solution {
    public int largestAltitude(int[] gain) {
        // prifix sum;
        int n= gain.length;
        
        int mx=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+gain[i];
            mx= Math.max(mx,sum);
            
        }
        return mx;




    }
}