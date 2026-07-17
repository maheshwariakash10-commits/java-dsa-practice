class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i< nums.length;i++){
            if(!list.contains(nums[i])) count=0;     
            if(count<k){   
                list.add(nums[i]);
                count=count+1;
            }             
        }
        
        int arr[]= new int[ list.size()];
        for(int i=0 ; i< arr.length ; i++){
            arr[i]= list.get(i);
        }
        return arr;
        
    }
}