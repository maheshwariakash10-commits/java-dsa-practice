class Solution {
    public String reversePrefix(String word, char ch) {
        int idx =  word.indexOf(ch);
        if(idx==-1) return word;

        String ans= "";
        for(int i=idx; i>=0 ; i--){

            ans+= word.charAt(i);
        }
        
        for(int i=idx+1 ;i < word.length(); i++){
            ans+= word.charAt(i);
        }

        return ans;
    }
}