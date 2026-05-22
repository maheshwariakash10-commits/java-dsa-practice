class Solution {
    public int minLengthAfterRemovals(String s) {
        int countA=0;
        int countB=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a') countA++;
            if(s.charAt(i)=='b') countB++;
        }
        return Math.abs(countA-countB);
    }
}