class Solution {
    public boolean judgeSquareSum(int c) {
        // boolean check=false;
     for(int i=0;i<=Math.sqrt(c);i++){
        double b= Math.sqrt(c-i*i);
        if(b==(int)b){
                return true;
         }
     }
     return false;   
    }
}