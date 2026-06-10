class Solution {
    public boolean isHappy(int n) {
        if(n<=9) {
            if(n==1||n==7) return true;
            return false;
        }

        int cp =n;
        int pdt=0;
        while(cp!=0){
            int rem= cp%10;
            pdt= pdt+(rem*rem);
            cp/=10;
        }
        return isHappy(pdt);
        
    }
}