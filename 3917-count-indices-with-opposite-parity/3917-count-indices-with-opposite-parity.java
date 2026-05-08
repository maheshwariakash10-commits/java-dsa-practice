class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n= nums.length;
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=countParity(nums[i] ,nums, i);
        }
        return arr;

    }

    public int countParity(int ele , int nums[],  int i){
        int n=nums.length;
        int cnt=0;
           if(ele%2==0){
               for(int j=i+1;j<n;j++){
                   if(nums[j]%2!=0){
                       cnt++;
                   } 
               }
           }
           else{
               for(int j=i+1;j<n;j++){
                   if(nums[j]%2==0){
                       cnt++;
                   }
                } 
            }
        return cnt;
    }
}