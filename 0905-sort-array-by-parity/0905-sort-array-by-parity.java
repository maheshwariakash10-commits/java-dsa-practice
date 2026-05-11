class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=  nums.length;
        int res[]=  new int[n];
        int low=0;
        int high= n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                res[low]=nums[i];
                low++;
            }
            else{
                res[high]=nums[i];
                high--;

            }
        
        }
        return res;       
    }
}