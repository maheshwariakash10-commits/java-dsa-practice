class Solution {
    public char findTheDifference(String s, String t) {
        int xor=0;
        int n= s.length();
        int m= t.length();

        for(int i=0;i<n;i++){
            xor= xor^(int)s.charAt(i);
        }
        for(int j=0;j<m;j++){
            xor= xor^(int)t.charAt(j);
        }
        return (char)xor;      
    }
}