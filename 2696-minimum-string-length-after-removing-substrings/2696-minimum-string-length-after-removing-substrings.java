class Solution {
    public int minLength(String s) {
        Stack<Character> stack= new Stack<>();

        for(int i=0 ; i< s.length();i++){
            char x=s.charAt(i);

            if(stack.isEmpty()){
                stack.push(x);
            }
            else if((stack.peek()=='A' && x=='B') || (stack.peek()=='C' && x=='D')){
                stack.pop();
            }
            else{
                stack.push(x);
            }
        }
        return stack.size();
        
    }
}