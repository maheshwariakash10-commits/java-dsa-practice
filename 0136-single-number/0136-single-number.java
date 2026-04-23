class Solution {
    public int singleNumber(int[] nums) {
        //Xor approch one of the best  ^ is xor bit manipualtion
        // sorting
        // hashmap
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor= xor ^nums[i];
        }
        return xor;

        
        
    }
}