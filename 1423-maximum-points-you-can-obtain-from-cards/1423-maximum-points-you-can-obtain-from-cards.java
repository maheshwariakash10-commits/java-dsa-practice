class Solution {
    public int maxScore(int[] cardPoints, int k) {  
        int []arr=  cardPoints;
        int n= arr.length;
        int li = n-1; //last index;
        int sum=0;
        for(int i=0; i < k ;i++){
            sum+= arr[i];
        }
        int mx= sum;
        for(int i= k-1; i>=0 ;i--){
            sum= sum- arr[i];
            sum= sum+arr[li];
            li--;
            mx= Math.max(mx, sum);
        }
        return mx;
        
    }
}