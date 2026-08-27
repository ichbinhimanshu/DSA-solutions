class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        
        if(nums.length==1){
            return nums[0];
        }
        else{
            if(nums[l]<=nums[r]){
                return nums[l];
            }
            else{
                while(l<r){
                    int mid = l+(r-l)/2;
                    if(nums[r]<nums[mid]){
                        l=mid+1;
                    }

                    // else if(nums[l]>nums[mid]){
                    //     r=mid;
                    // }

                    else{
                        r=mid;
                    }

                }
                return nums[l];
            }
        }
    }
}