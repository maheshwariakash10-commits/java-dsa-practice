class Solution {
    public int[] runningSum(int[] nums) {
        // prefix sum;

        int n= nums.length;
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            arr[i]= sum;
        }
        return arr;

        
    }
}