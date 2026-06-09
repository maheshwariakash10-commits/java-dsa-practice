class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int n= candies.length;
        ArrayList<Boolean> arr= new ArrayList<>();
        // boolean arr[]= new boolean[n];

        for(int i=0;i<n;i++){
            max= Math.max(max,candies[i]);
        }

        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>= max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}