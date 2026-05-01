class Solution {
    public int minLengthAfterRemovals(String s) {
        int n= s.length();
        int acount=0;
        int bcount=0;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a') acount++;
            if(s.charAt(i)=='b') bcount++;
        }
        return Math.abs(acount-bcount);

    }
}