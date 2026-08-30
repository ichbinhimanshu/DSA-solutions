class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int tc = 0;
        int sc = 0;

        for(int i : nums){
            if(i==target){
                tc++;
            }
            else if(i<target){
                sc++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        // while(tc>0){
        //     ans.add(sc);
        //     sc++;
        //     tc--;
        // }

        while(tc>=1){
            ans.add(sc);
            sc++;
            tc--;
        }
        return ans;
    }
}