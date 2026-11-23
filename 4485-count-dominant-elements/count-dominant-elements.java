class Solution {
    public int countDominantElements(int[] nums) {
        int count = 0;
        
        if(nums.length==1){
            return 1;
        }
        if(nums[0]>=nums[1]){
            count++;
        }
        if(nums[nums.length-1]>=nums[nums.length-2]){
            count++;
        }


        for(int i=1;i<nums.length-1;i++){
            if( nums[i] >= (double)(nums[i-1] + nums[i+1])/2 ){
                count++;
            }
        }
        
        return count;
    }
}