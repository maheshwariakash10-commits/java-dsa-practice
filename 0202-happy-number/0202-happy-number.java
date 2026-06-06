class Solution {
    public boolean isHappy(int n) {
        // HashSet<Integer> set= new HashSet<Integer>();

        while(n>9){
            int temp =n;
            int sum=0;
            while(temp!=0){
                int rem= temp%10;
                 sum+= (rem*rem);
                temp/=10;
            }
            n= sum;
        }
        if(n==1||n==7)return true;
        
        return false;
        
        
    }
}