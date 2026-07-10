class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        int left=0;
        int max= Integer.MIN_VALUE;

        for(int r= 0 ; r<n; r++){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1); // allway add

            while( map.size()>2){ // shrink  start agar size 2 se bada tho

                map.put(fruits[left], map.get(fruits[left])-1); //

                if(map.get(fruits[left]) ==0){
                    map.remove(fruits[left]);
                } 

                left++;
            }

            max=Math.max(max, r-left+1);

        }
        return max;
        
    }
}