class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;

        int arr[]= new int[n+m];
        int i=0;
        for(int j=0; j< n; j++){
            arr[i]= nums1[j];
            i++;
        }
        for(int j=0; j< m; j++){
            arr[i]= nums2[j];
            i++;
        }

        Arrays.sort(arr);
        int l= arr.length;

        if(l%2==0){
            return (double)(arr[l/2] + arr[l/2 - 1])/2;
        }
        else{
            return arr[l/2];
        }

    }
}