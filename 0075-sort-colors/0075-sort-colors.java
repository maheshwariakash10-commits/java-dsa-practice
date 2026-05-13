class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int res[]= new int[n];
        int high=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]==2){
                res[high]=2;
                high--;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                res[high]=1;
                high--;
            }
        }
        
        for(int i=0;i<n;i++){
               nums[i]=res[i];

        }
    }
}