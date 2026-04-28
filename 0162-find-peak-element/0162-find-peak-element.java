class Solution {
    public int findPeakElement(int[] nums) {
        int n= nums.length;
        int mx= nums[0];

        for(int i=0;i<n;i++){
            if(mx<=nums[i]) mx= nums[i];
            else return i-1;
        }
        return n-1;
        
    }
}