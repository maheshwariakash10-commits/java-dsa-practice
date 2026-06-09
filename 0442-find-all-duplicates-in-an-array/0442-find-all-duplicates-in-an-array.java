class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();

        for(int ele: nums){
            if(set.contains(ele)) list.add(ele);
            else{
                set.add(ele);
            }
        }
        return list;
    }
}