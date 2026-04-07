class Solution {
    public int differenceOfSums(int n, int m) {
        
        return notDivisibleByM(n,m)-divisibleByM(n,m);
    }
    public static int notDivisibleByM(int n, int m){
        int num1=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                num1= num1+i;
            }
        }
        return num1;
    }
    public static int divisibleByM(int n, int m){
        int num2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2= num2+i;
            }
        }
        return num2;
    }

}