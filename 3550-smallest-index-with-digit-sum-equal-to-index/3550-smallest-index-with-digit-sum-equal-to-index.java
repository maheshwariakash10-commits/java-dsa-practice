class Solution {
    public int smallestIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){ 
        
            int sum= 0;
            int cp=nums[i];
            while(cp!=0){
                int rem= cp%10;
                sum=sum+rem;
                cp/=10;
            }
            if(i==sum) return i;


        }
        return -1;

    


        
    }
}