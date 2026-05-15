class Solution {
    public int largestAltitude(int[] gain) {
        int sum= 0;
        int mx=0;
        int n= gain.length;
        for(int i=0 ;i<n;i++){
            sum= sum+gain[i];;
            mx=Math.max(mx,sum);
        }
        return mx;

    }
}