class Solution {
    public int findDuplicate(int[] nums) {
        for(int i:nums){
            i = Math.abs(i);

            if(nums[i]<0){
                return i;
            }

            nums[i]=-nums[i];

        }

        return -1;
    }   
}