class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int mx=0;
        int n= prices.length;

        
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min= prices[i];
            }

            if(mx<=prices[i]-min){
                mx=prices[i]-min;
            }

        }
        return mx;
    }
}