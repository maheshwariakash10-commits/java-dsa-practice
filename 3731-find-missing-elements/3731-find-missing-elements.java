class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n= nums.length;
        int low, high;
        low=Integer.MAX_VALUE;
        high=Integer.MIN_VALUE;
        HashSet<Integer> set= new HashSet<>();

        for(int ele: nums){
            low= Math.min(low,ele);
            high= Math.max(high,ele);
            set.add(ele);
        }
        List<Integer> list= new ArrayList<>();

        while(low<=high){
            if(!set.contains(low)){
                list.add(low);
            }
            low++;
        }
        return list;

        
    }
}