import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            arr1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(arr1.contains(nums2[i]) && !list.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

        
    }
}