class Solution {
    public int fib(int n) {
        if(n==0||n==1)  return n;
        
        int n0=0;
        int n1=1;
        int nn=0;

        for(int i=1;i<n;i++){
            nn=n0+n1;
            n0=n1;
            n1=nn;
        }
        return n1;

        
    }
}