class Solution {
    public int numberOfSteps(int num) {
       // recursive approch
       int count=0 ;
       return step(num, count);

    }
    public int step(int n, int count){
        if(n==0) return count;
        if(n%2==0)return step(n/2, count+1);
        else{
            return step(n-1, count+1);
        }
    }
}