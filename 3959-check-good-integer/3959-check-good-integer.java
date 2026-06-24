class Solution {
    public boolean checkGoodInteger(int n) {
        int sqsum= 0;
        int sum=0;
        
        while( n>0){
            int rem = n%10;
            sum+= rem;
            sqsum+= (rem*rem);
            n/=10;
        }
        return sqsum - sum >= 50;
    }
}