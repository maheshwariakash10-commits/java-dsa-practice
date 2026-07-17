class Solution {
    public String trimTrailingVowels(String s) {
        
        String ans="aeiou";
        int count=0;
        int n=s.length();

        for(int i= s.length()-1 ; i>=0; i--){
            char ch= s.charAt(i);
            if(ans.indexOf(ch)!=-1){
               count++; 
            }
            else{
                break;
            }
        }
        
        
        return s.substring(0,n-count);
        
    }
}