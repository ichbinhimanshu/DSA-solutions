import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            arr1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(arr1.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

        
    }
}