class Solution {
    public int[] scoreValidator(String[] events) {
        int n= events.length;
        
        int count=0;
        int sc=0;
        int res[]= new int[2];
        for(int i=0;i<n;i++){
            String str=events[i];

            if( str.equals("W")){
                count++;
                if(count==10) break;
            } 
            else if( str.equals("0"))sc=sc+0;
            else if(str.equals("1")) sc=sc+1;
            else if( str.equals("2"))sc=sc+2;
            else if( str.equals("3"))sc=sc+3;
            else if( str.equals("4"))sc=sc+4;
            else if( str.equals("5"))sc=sc+5;
            else if( str.equals("6"))sc=sc+6;
            else{
                sc++;
            }

        }
        res[0]= sc;
        res[1]=count;
        return res;
    }
}