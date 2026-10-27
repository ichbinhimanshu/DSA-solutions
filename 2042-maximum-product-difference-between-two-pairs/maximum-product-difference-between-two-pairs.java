class Solution {
    public int maxProductDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smax = max;
                max = nums[i];
            }
            else if(nums[i]>smax){
                smax = nums[i];
            }

            if(nums[i]<min){
                smin = min;
                min = nums[i];
            }
            else if(nums[i]<smin){
                smin = nums[i];
            }
        }

        return (max*smax)-(min*smin);
    }
}