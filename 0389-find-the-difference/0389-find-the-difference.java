class Solution {
    public char findTheDifference(String s, String t) {
        char n[]= s.toCharArray();
        char m[]= t.toCharArray();
        int xor=0;

        for(int i=0;i<n.length;i++){
            xor=xor^n[i];
        }

        for(int i=0;i<m.length;i++){
            xor=xor^ m[i];
        }

        
        return (char)(xor);
    }
}