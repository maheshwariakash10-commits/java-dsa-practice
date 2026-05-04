class Solution {
    public int firstUniqueEven(int[] nums) {

         LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int mn=Integer.MAX_VALUE;
        for(int ele:nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        
        for(int key:map.keySet()){
            if(key%2==0 && map.get(key)==1){
                return key;
            }
        }

        return -1;
    }
}