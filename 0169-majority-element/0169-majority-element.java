class Solution {
    public int majorityElement(int[] nums) {
        //  Tc= O(nlogn) Sc=O(1)
        Arrays.sort(nums);
        int n= nums.length;
        return  nums[n/2];
    }
}