class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int ans=0;
        int count=0;

        while(i<nums.length){
            if(nums[i] == 1){
                count++;
                if(count>ans){
                    ans=count;
                }
            }
            else{
                count=0;
            }
            i++;
        }
        return ans;
    }
}