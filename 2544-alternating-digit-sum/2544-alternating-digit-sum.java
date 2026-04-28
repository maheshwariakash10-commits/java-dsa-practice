class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int count=0;
        int rev=0;
        while(n!=0){
            int rem= n%10;
            rev= rev*10+rem;
            n/=10;
        }




        while(rev!=0){
            int rem=rev%10;
            count++;
            
            if(count%2!=0){
                sum=sum+rem;
            }
            else{
                sum=sum-rem;
            }

            rev/=10;

        }
        return sum;
        
    }
}