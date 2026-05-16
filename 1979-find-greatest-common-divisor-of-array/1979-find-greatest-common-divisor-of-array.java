class Solution {
    public int findGCD(int[] nums) {
        int n= nums.length;
        int mi=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            mi=Math.min(mi,nums[i]);// use for minimus value
        }
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);// use for maximum value
        }

        for(int i=mi;i>=1;i--){
            if(mx%i==0 && mi%i==0) return i;//gcd of largest number and smallest number
        }
        return -1;
    }
}