class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n= nums.length;
        int bount=0;
        int count=0;
        for(int i=0;i<n;i++){
            bount= bount+nums[i];
            if(bount==0) count++;
        }
        return count;

        
    }
}