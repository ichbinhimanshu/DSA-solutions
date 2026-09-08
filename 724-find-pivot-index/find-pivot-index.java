class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        for(int i:nums){
            rsum = rsum+i;
        }

        for(int i=0;i<nums.length;i++){
            rsum = rsum -nums[i];

            if(rsum == lsum){
                return i;
            }

            lsum = lsum +nums[i];
        }

        return -1;
    }
}