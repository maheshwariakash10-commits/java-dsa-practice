class Solution {
    public boolean isHappy(int n) {
        while(n>=9){
            int temp=0;
            while(n>0){
                int rem= n%10;
                temp= temp+(rem*rem);
                n/=10;
            }
            n=temp;
        }
        if(n==1||n==7){
            return true;
        }
        else{
            return false;
        }
    }
}