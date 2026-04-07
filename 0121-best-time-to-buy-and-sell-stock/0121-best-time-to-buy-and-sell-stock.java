class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int minp=prices[0];

        int max= 0;
        for(int i=0;i<n;i++){
          
            minp= Math.min(minp, prices[i]);
             int dff= prices[i]- minp; 
            max= Math.max(max,dff);
        }
        return max;
    }
}