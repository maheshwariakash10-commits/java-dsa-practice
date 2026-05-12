class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n= word1.length();
        int m= word2.length();
        String res="";
        int mx= Math.max(n,m);
        for(int i=0;i<mx;i++){
            if(n>i && m> i) {
                res=res+word1.charAt(i)+ word2.charAt(i);
            }
            
            else if(n>i)res=res+word1.charAt(i);
            else{
                res=res+word2.charAt(i);
            }
        }
        return res;
    }
}