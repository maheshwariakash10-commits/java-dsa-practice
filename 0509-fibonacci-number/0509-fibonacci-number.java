class Solution {
    public int fib(int n) {
        int f0=0;
        int f1=1;

        for(int i=1;i<=n;i++){
            int tem = f0+f1;
            f0=f1;
            f1=tem;
        }
        return f0;
    }
}