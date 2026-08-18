// class Solution {
//     public int[] sortedSquares(int[] n) {
//         int i=0;
//         int j=n.length-1;
//         int k=n.length-1;
        
//         int[] sq = new int[n.length];
//         int[] x = new int[n.length];

//         while(i<=j){
//             if(Math.abs(n[i])>Math.abs(n[j])){
//                 x[k] = Math.abs(n[i]);
//                 i++;
//             }
//             else{
//                 x[k] = Math.abs(n[j]);
//                 j--;
//             }
//             k--;
//         }
//         for(i=0;i<n.length;i++){
//             sq[i] = x[i]*x[i];
//         }

//         return sq;
//     }
// }














class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length-1;
        int j=nums.length-1;
        int sortsq[] = new int[nums.length];

        while(i<=j){
            if((nums[i]*nums[i])>(nums[j]*nums[j])){
                sortsq[n]=(nums[i]*nums[i]);
                i++;
            }
            else{
                sortsq[n]=(nums[j]*nums[j]);
                j--;
            }
            n--;
        }
        return sortsq;


    
    }
}