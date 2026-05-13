class Solution {
    public boolean isPalindrome(int x) {
     if(x<0){
        return false;
     } 
     int rev =0;
     int cp = x;
     while(cp!=0){
        int rem = cp%10;
        rev= rev*10+rem;
        cp/=10;
     }
     return rev==x;

    }
}