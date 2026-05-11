class Solution {
    public int dominantIndex(int[] nums) {
        int n= nums.length;
        int max=nums[0];
        int mxIndex=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max==nums[i]) mxIndex=i;
        }

        for(int i=0;i<n;i++){
            if(max!=nums[i]){
                if(nums[i]>max/2){
                    return -1;
                }
            }
        }


        return mxIndex;
    }
}