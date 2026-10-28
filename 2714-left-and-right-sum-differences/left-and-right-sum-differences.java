class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        int ans[] = new int[nums.length];

        int lsum = 0;
        for(int i=0;i<nums.length;i++){
            leftSum[i] = lsum;
            lsum = lsum + nums[i];
        }
        

        int rsum = 0;
        for(int i=nums.length-1;i>=0;i--){
            rightSum[i] = rsum;
            rsum = rsum + nums[i];
        }

        int adiff = 0;
        for(int i=0;i<nums.length;i++){
            adiff = leftSum[i] - rightSum[i];

            if(adiff<0){
                adiff=adiff*(-1);
            }

            ans[i] = adiff;
        }
        return ans;


    }
}