class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet <Integer> set= new HashSet<>();
    //  time complecxit is O(n)
// AND SPACE COM. IS O(N) KYU KI HASH SET BANAYA HE N SIZE KA 
        for(int else: nums){
            set.add(nums[i]);// removing the dupcliate
        }  


        for(int i=1;i<=n+1;i++){
            if(!set.contains(i)) return i; // !nset.conatin check karega ki he ki nahi false nahi huha tho i return ;            
        }
        return -1;    
    }
}