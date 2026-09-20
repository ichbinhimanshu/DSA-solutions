class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j = matrix.length * matrix[0].length - 1;

        while(i<=j){
            int m=i+(j-i)/2;
            int row = m / matrix[0].length;
            int col = m % matrix[0].length;
            if(target > matrix[row][col]){
                i=m+1;
            }
            else if(target < matrix[row][col]){
                j=m-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}