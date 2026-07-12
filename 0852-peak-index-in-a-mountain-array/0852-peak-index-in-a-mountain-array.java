class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high= arr.length -1;
        
        while(low<high){
            int mid= low+ (high-low)/2;

            if(arr[mid]< arr[mid+1]){
                // acending order;
                // aage se value hata denge 
               low= mid+1;
            }
            else{
                // decending order 
                // piche se value hata denge
                high= mid;
            }
        }
        return low;
    }
}