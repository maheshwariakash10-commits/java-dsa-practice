class Solution {
    public int minimumOperations(int[] nums) {
        int n= nums.length;
        int count=0;
        Set<Integer> set= new HashSet<>();

        for(int i=0;i<n;i++){
            if(set.contains(nums[i])==false &&nums[i]!=0){
                count++;
            }
            set.add(nums[i]);
        }
        return count;
        
    }
}