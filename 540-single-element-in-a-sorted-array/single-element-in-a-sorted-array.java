class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length-1;

        if(nums.length==1){
            return nums[0];
        }

        if(nums[0]!=nums[1]){
            return nums[0];
        }
        else{
            i=2;
        }

        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        else{
            j=nums.length-3;
        }



        while(i<=j){
            int mid = i+(j-i)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2==0){
                if(nums[mid]!=nums[mid+1]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else if(mid%2!=0){
                if(nums[mid]!=nums[mid-1]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }

        }
        return -1;

    }
}