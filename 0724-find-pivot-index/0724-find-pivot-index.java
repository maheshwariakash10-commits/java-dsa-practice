class Solution {
    public int pivotIndex(int[] nums) {
        // tc= O(n) sc= O(n)
        int n=nums.length;

        int pri[]= new int[n];
        int suff[] = new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            sum= sum+nums[i];
            pri[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum= sum+nums[i];
            suff[i]=sum;
        }

        for(int i=0;i<n;i++){
            if(pri[i]==suff[i]) return i;
        }
        return -1;

        
    }
}