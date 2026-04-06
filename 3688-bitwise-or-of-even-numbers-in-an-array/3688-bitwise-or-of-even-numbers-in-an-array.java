class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int n= nums.length;
        int a=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)a= a|nums[i];
        }
        return a;
        
    }
}