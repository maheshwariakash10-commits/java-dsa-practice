class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;

        for(int j=0;j<n;j++){
            if(nums[j]==i){
                i++;
            }
            else{
                return i;
            }
        }
        return i;
    }
}