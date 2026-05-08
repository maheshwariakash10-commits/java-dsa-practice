class Solution {
    public long removeZeros(long n) {
        long cp=n;
        long r1=0;
        while(cp!=0){
            long rem= cp%10;
            if(rem!=0) r1=r1*10+rem;
            cp/=10;
        }
        cp=0;
        while(r1!=0){
            long rem= r1%10;
            if(rem!=0) cp=cp*10+rem;
            r1/=10;
        }
        return cp;
    }
}