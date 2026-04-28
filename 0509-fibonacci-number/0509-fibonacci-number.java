class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }// base case

       int f0= 0;
      int f1= 1;
      int x=0;

      for(int i=2;  i<=n; i++ ){
        
        x= f0+f1;
        f0=f1;
        f1=x;
      }
      return x;

    }
}