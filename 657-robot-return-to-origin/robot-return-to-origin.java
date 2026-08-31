class Solution {
    public boolean judgeCircle(String moves) {
        int sumx = 0;
        int sumy = 0;
        for(char i : moves.toCharArray()){
            
            if(i=='U'){
                sumx=sumx+1;
            }
            if(i=='D'){
                sumx=sumx-1;
            }
            if(i=='L'){
                sumy=sumy+2;
            }
            if(i=='R'){
                sumy=sumy-2;
            }
        }
        return (sumx == 0 && sumy==0);

    }
}