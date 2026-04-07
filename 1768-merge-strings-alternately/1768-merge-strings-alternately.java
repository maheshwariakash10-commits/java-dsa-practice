class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n= word1.length();
        int m= word2.length();
        int max= Math.max(n,m);
        String mergedstring="";
        for(int i=0;i<max;i++){
            if(i<m && i<n) mergedstring = mergedstring + word1.charAt(i)+ word2.charAt(i);
            else if( i>=m&& i<=n)mergedstring = mergedstring + word1.charAt(i);
            else if(i<=m && i>=n)mergedstring = mergedstring + word2.charAt(i);
        }
        return mergedstring;
        
    }
}