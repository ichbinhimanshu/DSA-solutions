class Solution {
    public int maximumCount(int[] nums) {
        //negetive side check
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<0){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        int neg = l;


        //positve side check
        l=0;
        r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]<=0){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        int pos = nums.length-l;
        return Math.max(neg,pos);
    }
}