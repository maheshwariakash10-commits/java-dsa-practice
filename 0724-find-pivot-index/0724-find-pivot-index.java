class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pre[]= new int[n];
        int suff[]= new int[n];
        int ps=0;
        int ss=0;

        for(int i=0;i< n;i++){
            ps= ps+nums[i];
            pre[i]= ps;
        }

        for(int i=n-1 ;i>=0 ;i--){
            ss+= nums[i];
            suff[i]= ss;
        }

        for(int i=0;i< n;i++){
            if(pre[i]== suff[i]) return i;
        }

        return -1;

    }
}