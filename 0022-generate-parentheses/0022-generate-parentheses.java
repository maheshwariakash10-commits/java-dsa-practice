class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans= new ArrayList<>();
        result(n, 0, 0,"", ans);
        return ans;
        
    }
    public void result(int n, int Lcount, int Rcount, String s, List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
            return; 
        }

        if( Lcount<n){
            result(n, Lcount+1, Rcount ,s+"(", ans);
        }
        if( Rcount<Lcount){
            result(n, Lcount, Rcount+1 ,s+")", ans);
        }
    }
}