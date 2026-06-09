class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();

        //  adding into seet remocing duplicate and eeasy to sarch
        for(int ele:nums1){
            set1.add(ele);
        }

        //  if  element of array  is in the set1 then add in set2  for commen
        HashSet<Integer> set2 = new HashSet<>();
        for(int ele : nums2){
            if(set1.contains(ele)==true){
                set2.add(ele);
            }
        }


        // set to  array conversin
        int arr[]= new int[set2.size()];
        int i=0;
        for(int ele: set2){
            arr[i]= ele;
            i++;
        }
        return arr;

    }
}