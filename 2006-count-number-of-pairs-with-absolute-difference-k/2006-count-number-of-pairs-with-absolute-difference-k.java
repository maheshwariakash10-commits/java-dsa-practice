class Solution {
    public int countKDifference(int[] nums, int k) {
        int n= nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j= i+1; j<n;j++){
                int dff= Math.abs(nums[i]- nums[j]);
                if(dff==k) count++;
            }
        }
        return count;
    }
}