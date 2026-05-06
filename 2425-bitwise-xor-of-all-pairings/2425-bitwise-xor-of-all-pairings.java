class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        // Tc= O(n)   Sc= O(n)
        int n= nums1.length;
        int m= nums2.length;
        int xor= 0;
        if(n%2!=0){
            for(int j=0;j<m;j++){
                xor=xor^nums2[j];
            }
        }
        if(m%2!=0){
            for(int j=0;j<n;j++){
                xor=xor^nums1[j];
            }
        }


        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         xor=xor^(nums1[i]^nums2[j]);
        //     }
        // }


        return xor;
    }
}