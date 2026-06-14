class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph= paragraph.toLowerCase();
        // String arr[]= paragraph.toStringArray(); not exist any this type of function 
        String arr[]= paragraph.split("[0-9!?',;.\\s]+");


        HashMap<String, Integer> map= new HashMap<>();

        for(String ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for(String ele: banned){
            if(map.containsKey(ele.toLowerCase())) map.remove(ele);
        }

        int mx=0;
        for(String key: map.keySet()){
            mx=Math.max(map.get(key), mx);
        }


        for(String key: map.keySet()){
            if(map.get(key)== mx) return key;
        }
        return " ";
        
    }
}