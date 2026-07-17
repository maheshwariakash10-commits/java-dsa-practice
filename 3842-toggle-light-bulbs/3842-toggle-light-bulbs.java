class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        TreeMap<Integer, Integer> map= new TreeMap<>();

        for(int ele: bulbs){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        List<Integer> set= new ArrayList<>();

        for(int key: map.keySet()){
            if(map.get(key)%2!=0){
                set.add(key);
            }
        }
        return set;
    }
}