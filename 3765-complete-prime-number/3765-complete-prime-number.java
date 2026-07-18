class Solution {
    public boolean completePrime(int num) {
        
        int cp =num;
        // int digit=0;

        boolean check= true;

        // digit count
        // while(cp!=0){
        //         digit++;
        //         cp/= 10;
        //     }
        // cp=num;



        // suffix
        int count=0;
        while(cp!=0){
            ++count;
            int rem= num%(int)Math.pow(10,count);
            check=isprime(rem);
            if(check== false) return check;
            cp= cp/10;
        }

        cp=num;
       

        //prefix
        while(cp!=0){
            --count;
            int rem = num/(int)Math.pow(10, count);
            check=isprime(rem);
            if(check== false) return check;
            cp= cp/10;
        }

        return true;
        
    }

    public boolean isprime(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0) count++;
        }

        return count==2;
    }

}