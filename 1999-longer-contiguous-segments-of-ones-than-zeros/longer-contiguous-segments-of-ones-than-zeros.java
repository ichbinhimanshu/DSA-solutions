class Solution {
    public boolean checkZeroOnes(String s) {
        int i=0;
        int one = 0;
        int zero = 0;
        int max1 = 0;
        int max0 = 0;
        boolean ans = false ;

        while(i<s.length()){
            if(s.charAt(i)=='1'){
                one++;
                if(one>max1){
                    max1=one;
                }
                zero=0;
            }
            else{
                zero++;
                if(zero>max0){
                    max0=zero;
                }
                one=0;
            }
            i++;
        }
        return (max1>max0)?true:false;
    }
}