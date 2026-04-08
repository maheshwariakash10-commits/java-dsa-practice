class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int netprofit=0;
        for(int i=0;i<n-1;i++){
            int dff= prices[i+1]-prices[i];
            if(dff>=0){
                netprofit=netprofit+dff;
            }
        }
        return netprofit;
    }
}