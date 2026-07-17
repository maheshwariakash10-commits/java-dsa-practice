class Solution {
    public long sumAndMultiply(int n) {
        int dummy= n;
        int cp=0; // reverse
        long sum= 0;

        while(dummy!=0){
            int rem= dummy%10;

            if(rem!=0) { // removing zero
                cp=cp*10+rem;
            }
            sum= sum+rem;

            dummy=dummy/10;
        }

        return reverse(cp)*sum;


        
    }
    public long reverse(long cp){
        long rev= 0;
        while(cp!=0){
            rev= rev*10+ cp%10;
            cp/=10;
        }
        return rev;
    }
    
}