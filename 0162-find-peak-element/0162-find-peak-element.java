class Solution {
    public int findPeakElement(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int n=nums.length;
        int indx=0;

        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            if(mx==nums[i]) indx=i;
        }
        return indx;
    }
}