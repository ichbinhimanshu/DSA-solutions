class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char col1 = coordinate1.charAt(0);
        int row1 = coordinate1.charAt(1);
        char col2 = coordinate2.charAt(0);
        int row2 = coordinate2.charAt(1);
        int sum1=0;
        int sum2=0;

        if(col1 == 'a' || col1 == 'c' || col1 == 'e' || col1 == 'g'){
            if(row1%2==0){
                sum1=1;
            }
            else{
                sum1=2;
            }
        }
        else{
            if(row1%2==0){
                sum1=2;
            }
            else{
                sum1=1;
            }
        }

        if(col2 == 'a' || col2 == 'c' || col2 == 'e' || col2 == 'g'){
            if(row2%2==0){
                sum2=1;
            }
            else{
                sum2=2;
            }
        }
        else{
            if(row2%2==0){
                sum2=2;
            }
            else{
                sum2=1;
            }
        }

        return sum1==sum2;

    }
}