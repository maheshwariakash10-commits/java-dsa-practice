class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> res= new Stack<>();
        

        for(int i=0;i< s.length(); i++){
            if(res.isEmpty()){
                res.push(s.charAt(i));
            } 
            else if(res.peek()== s.charAt(i)){
                res.pop();
            }
            else{
                res.push(s.charAt(i));
            }
        }
        String ans="";
        // while(!res.isEmpty()){
        //     ans+=res.pop();
        // }

        for(char e: res){
            ans+= e;
        }
        return ans;
        
        
        
    }
}