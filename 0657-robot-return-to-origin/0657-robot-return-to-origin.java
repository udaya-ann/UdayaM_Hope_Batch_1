class Solution {
    public boolean judgeCircle(String moves) {
         int t = 0;
        int l = 0;
        
        for(char c: moves.toCharArray()){
            if(c=='U') t-=1;
            else if(c=='D') t+=1;
            else if(c=='L') l-=1;
            else if(c=='R') l+=1;
        }
        
        return l==0 && t==0;
    }
}