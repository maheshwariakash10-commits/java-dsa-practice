class Solution {
    public int minElement(int[] nums) {
        int n= nums.length;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int sum= 0;
            int ele= nums[i];
            while( ele!=0){
                int rem= ele%10;
                sum= sum+rem;
                ele/=10;
            }
            min= Math.min(min,sum);
        }
        return min;
        
    }
}