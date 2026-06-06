class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<Integer>();

        while(n!=1){
            int temp =n;
            int sum=0;
            while(temp!=0){
                int rem= temp%10;
                 sum+= (rem*rem);
                temp/=10;
            }
            if(set.contains(sum)) return false;

            set.add(sum);
            n= sum;
        }
        return true;
        
    }
}