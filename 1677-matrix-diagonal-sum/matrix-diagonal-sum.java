class Solution {
    public int diagonalSum(int[][] mat) {
        //primary diagonal sum
        int pd=0;
        for(int i=0;i<mat.length;i++){
            pd=pd+mat[i][i];
        }

        //secondary diagonal sum
        int sd=0;
        for(int i=0;i<mat.length;i++){
            sd=sd+mat[i][mat.length-1-i];
        }
        
        if(mat.length%2==0){
            return pd+sd;
        }
        else{
            return pd+sd-mat[(mat.length-1)/2][(mat.length-1)/2];
        }
        
    }
}