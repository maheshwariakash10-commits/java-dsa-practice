class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set= new HashSet<>();
        // int mx= 0;

        for(int i= 0 ;i< s.length(); i++){
            char c= s.charAt(i);
            set.add(c);
        }
        return  set.size();
    }
}