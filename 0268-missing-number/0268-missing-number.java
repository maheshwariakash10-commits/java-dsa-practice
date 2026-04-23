class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int tsum=0;
        int arsum=0;

        for(int i=0;i<n;i++){
            tsum= tsum+i+1;
            arsum= arsum+nums[i];
        }
        return tsum-arsum;
        
    }
}