class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-2;
        if(nums.length == 1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        else{
            l++;
        }

        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] > nums[mid+1]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}