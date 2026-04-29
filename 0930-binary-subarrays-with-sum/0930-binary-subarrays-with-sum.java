class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        //  slinding window ka he but abhi prifix se karra he 
        int n= nums.length;
        int count=0;

        for(int i=0; i<n; i++){
            int sum=0 ;

            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum==goal){
                    count++; 
                }            
            }
        }
        return count;
    }
}