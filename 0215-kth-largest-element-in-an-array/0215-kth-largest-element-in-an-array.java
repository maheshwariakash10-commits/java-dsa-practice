class Solution {
    public int findKthLargest(int[] nums, int k) {
        // with the sorting
        Arrays.sort(nums);
        int n= nums.length;
        return nums[n-k];

        
    }
}