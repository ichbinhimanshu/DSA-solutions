class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum = 0;
        int rightsum =0;
        for(int i=0;i<nums.length;i++){
            rightsum = rightsum + nums[i];
        }

        for(int i=0;i<nums.length;i++){
            rightsum = rightsum - nums[i];
            if(rightsum == leftsum){
                return i;
            }
            leftsum = leftsum + nums[i];
        }
        return -1;
    }
}