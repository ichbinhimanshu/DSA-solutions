class Solution {
    public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0);
        int row = coordinates.charAt(1);

        if(col == 'a' ||col == 'c' ||col == 'e' ||col == 'g'){
            return row%2==0;
        }
        else{
            return row%2!=0;
        }
    }
}