class Solution {
    public int minimumOperations(int[] nums) {
        int n= nums.length;
        int count=0;

        for(int ele: nums){
            if(ele%3!=0) count++;
        }
        return count;
        
    }
}