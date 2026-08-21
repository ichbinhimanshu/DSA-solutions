class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Store unique elements of nums1
        for (int num : nums1) {
            set.add(num);
        }

        // Check nums2 against nums1
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Convert Set<Integer> to int[]
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}