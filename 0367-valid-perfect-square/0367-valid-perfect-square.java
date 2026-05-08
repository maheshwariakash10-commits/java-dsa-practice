class Solution {
    public boolean isPerfectSquare(int num) {
        //with the use of Math function
        
        double b= Math.sqrt(num);
        if(b==(int)b) return true;
        return false; 
    }
}