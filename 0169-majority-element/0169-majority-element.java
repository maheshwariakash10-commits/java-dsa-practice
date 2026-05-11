class Solution {
    public int majorityElement(int[] nums) {
        // moore voting..
        int n= nums.length;
        int mj=nums[0];
        int voting=0;
        for(int i=0;i<n;i++){
            if(mj== nums[i]){
                voting++;
            }
            else if(mj!= nums[i]){
                voting--;
            }

            if(voting==0) {
                voting++;
                mj= nums[i];
            }


        }
        return mj;
    }
}