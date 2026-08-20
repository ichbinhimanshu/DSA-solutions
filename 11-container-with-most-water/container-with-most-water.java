class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int vol = 0;

        while(i<j){
            int widht = j-i;
            int length = Math.min(height[i],height[j]);
            int vol1 = widht * length;

            if(vol1 > vol){
                vol = vol1;
            }
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return vol;
    }
}