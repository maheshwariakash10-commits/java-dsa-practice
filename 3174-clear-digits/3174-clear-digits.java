class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack= new Stack<>();
        String temp="1234567890";
        for(int i=0 ;i< s.length(); i++){
            char ch= s.charAt(i);

            if(temp.indexOf(ch)!=-1){
                stack.pop();
            }
            else{
                stack.push(ch);
            }

        }

        String ans="";
        for(char ch: stack){
            ans+= ch;
        }

        return ans;
        
    }
}