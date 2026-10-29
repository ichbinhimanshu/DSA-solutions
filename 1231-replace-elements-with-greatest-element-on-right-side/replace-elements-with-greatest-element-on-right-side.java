class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int tmax = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>tmax){
                    tmax=arr[j];
                }
            }
            ans[i]=tmax;
            tmax=0;
        }
        ans[arr.length-1]=-1;
        return ans;
    }
}