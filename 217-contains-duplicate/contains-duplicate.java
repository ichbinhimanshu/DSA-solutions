// import java.util.*;
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int i = 0;
//         int j = 1;
//         while(j<nums.length){
//             if(nums[i]!=nums[j]){
//                 i++;
//                 j++;
//             }
//             else{
//                 return true;
//             }
//         }
//         return false;
//     }
// }

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(count.containsKey(nums[i])){
                return true;
            }
            else{
                count.put(nums[i],i);
            }
        }
        return false;
    }
}