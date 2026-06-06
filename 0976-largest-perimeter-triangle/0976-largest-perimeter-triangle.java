class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int sum=0;

        for(int i=0;i<n-2;i++){
            int a= nums[i];
            int b= nums[i+1];
            int c= nums[i+2];

            if(a+b>c){
                sum= Math.max(sum, (a+b+c));
            }

        }

        return sum;
    }
}