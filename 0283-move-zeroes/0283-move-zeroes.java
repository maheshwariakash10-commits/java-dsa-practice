class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int cp[]= new int[n];
        int i=0;
        for(int ele: nums){
            if(ele!=0) {
                cp[i]=ele;
                i++;
            }
            
        }
        for(int j=0;j<n;j++){
            nums[j]= cp[j];
        }
        

    }
}