class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int cp=x;
        while(cp!=0){
            sum=sum+(cp%10);
            cp/=10;
        }
        if(x%sum==0) return sum;
        else return -1;
    }
}