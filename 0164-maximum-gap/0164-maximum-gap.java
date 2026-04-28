class Solution {
    public int maximumGap(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int mx=0;

        for(int i=0;i<n-1;i++){
            int dff= nums[i+1]-nums[i];
            mx=Math.max(mx,dff);
        }
        return mx;
        
    }
}