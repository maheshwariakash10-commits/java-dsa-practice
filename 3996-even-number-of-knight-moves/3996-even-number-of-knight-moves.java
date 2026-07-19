class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startParty = (start[0] + start[1]) % 2;
        int targetParty = (target[0] + target[1]) % 2;

        return startParty == targetParty;
        
    }
}