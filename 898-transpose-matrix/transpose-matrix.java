// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         //square matrix
//         if(matrix.length == matrix[0].length){
//             int[][] ans = new int[matrix.length][matrix.length];

//             for(int i=0;i<matrix.length;i++){
//                 for(int j=0;j<matrix.length;j++){
//                     ans[j][i] = matrix[i][j];
//                 }
//             }

//             return ans;
//         }
//         //rectangular matrix
//         else{
//             int[][] ans = new int[matrix[0].length][matrix.length];

//             for(int i=0;i<matrix.length;i++){
//                 for(int j=0;j<matrix[0].length;j++){
//                     ans[j][i] = matrix[i][j];
//                 }
//             }

//             return ans;
//         }
//     }
// }


class Solution {
    public int[][] transpose(int[][] matrix) {
            int[][] ans = new int[matrix[0].length][matrix.length];

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    ans[j][i] = matrix[i][j];
                }
            }

            return ans;
        }
    }
