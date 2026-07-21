class Solution {
    public String removeStars(String s) {
        Stack<Character> stack= new Stack<>();

        for(int i=0; i< s.length(); i++){
            char ch= s.charAt(i);

            if(ch!='*'){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }

        String ans="";
        for(char ele: stack){
            ans+= ele;
        }
        return ans;
    }
}