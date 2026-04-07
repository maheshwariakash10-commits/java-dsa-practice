class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int netprofit=0;
        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                int dff=prices[i+1]- prices[i];
                netprofit= netprofit+dff;
            }
        }
        return netprofit;
    }
}