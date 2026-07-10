class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;

        int count = 0;
        int left = 0;
        int cp=1;

        for (int i = 0; i < n; i++) { //i=right
            cp= cp*nums[i];
            while(cp>=k){
                cp=cp/nums[left];
                left++;
            }
            count= count+(i-left+1);
        }

        return count;

    }
}