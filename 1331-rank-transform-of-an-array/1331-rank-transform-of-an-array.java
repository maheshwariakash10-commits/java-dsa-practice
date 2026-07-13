class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n= arr.length;
        int copy[]= arr.clone();

        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=1;

        for(int  i=0; i< n; i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i], count);
                count++;
            }
        }

        int ans[]= new int[n];
        for(int i=0;i< n;i++){
            ans[i]= map.get(arr[i]);
        }
        
        return ans;
        
    }
}