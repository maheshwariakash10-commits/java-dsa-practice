class Solution {
    public int subtractProductAndSum(int n) {
        
        int pd= 1;
        int sm=0;
        while(n>0){
            int rem = n%10;
            sm= sm+rem;
            pd= pd*rem;
            n=n/10;
        }
        
    
        return pd-sm;
        
    }
}