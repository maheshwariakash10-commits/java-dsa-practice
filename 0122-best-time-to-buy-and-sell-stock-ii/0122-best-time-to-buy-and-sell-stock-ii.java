class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int netprofit=0;
        // {}
        for(int i=0;i<n-1;i++){
            int dff= prices[i+1]-prices[i];//{7,1} 
            if(dff>0){ // false
                netprofit= netprofit + dff;
            }
        }
        return netprofit;

    }
}