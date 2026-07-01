class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list= new ArrayList<>();
         vaild(n, "", 0,0, list );
         return list;

    }

    public static void vaild(int n, String s, int lCount, int rCount,ArrayList<String> list){
        if(s.length()==2*n){
            list.add(s);
            return; 
        }

        if(lCount< n ){
            vaild(n, s+"(", lCount+1, rCount, list);
        }
        if(rCount< lCount ){
            vaild(n, s+")", lCount, rCount+1, list);
        }
    }
}
