class Solution {
    public boolean isSameAfterReversals(int num) {
        // Tc O(1)
        if(num==0) return true;
        if(num%10==0|| num<=0)return false;
        return true;
    }
}