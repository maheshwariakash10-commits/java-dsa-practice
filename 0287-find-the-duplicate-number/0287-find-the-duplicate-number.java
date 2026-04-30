class Solution {
    public int findDuplicate(int[] nums) {
        // using hash set;
        int n= nums.length;
        HashSet<Integer> set= new HashSet<>();
        for(int ele: nums){
            if(set.contains(ele)) return ele;
            set.add(ele);
        }
        return 0;
    }
}