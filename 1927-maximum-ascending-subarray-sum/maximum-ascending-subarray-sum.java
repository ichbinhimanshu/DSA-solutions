class Solution {
    public int maxAscendingSum(int[] nums) {
        int check1 = nums[0];
        int check2 = nums[0];
        int i=0;

        while(i<nums.length-1){
            if(nums[i]<nums[i+1]){
                i++;
                check1 = check1 + nums[i];

                if(check1>check2){
                    check2 = check1;
                }
            }
            else{
                i++;
                check1 = nums[i];
            }
        }
        return check2;
    }
}