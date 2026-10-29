// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int ans[] = new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             int tmax = 0;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]>tmax){
//                     tmax=arr[j];
//                 }
//             }
//             ans[i]=tmax;
//             tmax=0;
//         }
//         ans[arr.length-1]=-1;
//         return ans;
//     }
// }

class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[] = new int[arr.length];
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]=max;
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return ans;
    }
}