class Solution {
    public int differenceOfSums(int n, int m) {
        return(num1(n,m )-num2(n,m ));
        
    }
    public int num1(int n, int m ){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0) sum=sum+i;
        }
        return sum;
    }
    public int num2(int n, int m ){
        int sum=0;
        for(int i=1;i<=n;i++){
             if(i%m==0) sum=sum+i;
        }
        return sum;
    }
}