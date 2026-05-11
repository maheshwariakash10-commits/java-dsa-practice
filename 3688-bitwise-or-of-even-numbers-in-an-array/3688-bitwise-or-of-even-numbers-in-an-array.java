class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        
        int bitOr=0;
        for(int ele:nums){
             if(ele%2==0) bitOr=bitOr|ele;
        }
        return bitOr;
    }
}