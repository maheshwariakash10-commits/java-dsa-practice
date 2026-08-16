class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int n2= nums2.length;

        int arr[]= new int[n+n2];
        int l= arr.length;

        int i=0; // for  num1
        int j= 0; // for num2;

        for(int k=0 ; k< l ; k++ ){
            
            if(i< n && j< n2 ){
                int mn= Math.min(nums1[i], nums2[j]);
                arr[k]= mn;
                if(mn== nums1[i]) i++;
                else j++;

            }

            else if( i< n){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
        }





        

        if(l%2==0){
            return (double)(arr[l/2] + arr[l/2 - 1])/2;
        }
        else{
            return arr[l/2];
        }

    }
}