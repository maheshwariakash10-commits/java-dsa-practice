class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int minp= prices[0];
        int mx=0;
        for(int i=0;i<n;i++){
            minp= Math.min(minp,prices[i]);
            int cp= prices[i]- minp;
            mx= Math.max(cp,mx); 
        }
        return mx;
    }
}