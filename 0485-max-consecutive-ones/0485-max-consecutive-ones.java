class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int mx=0;

        for(int i=0;i< nums.length; i++){
            if(nums[i]== 1) count++;
            if( nums[i]==0) count=0;
            mx= Math.max(mx, count);
        }
        return mx;
    }
}