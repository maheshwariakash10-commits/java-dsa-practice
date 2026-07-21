class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0 ;i< s.length(); i++){
            char ch= s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(stack.peek()== ch){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        return stack.size();
    }
}