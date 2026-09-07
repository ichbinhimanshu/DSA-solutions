class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> ans = new HashMap<>();

        if(nums.length==0){
            return 0;
        }

        int max = 1;
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],false);
        }

        for(int i:ans.keySet()){
            if(ans.containsKey(i-1)){
                ans.put(i,true);
            }
        }

        for(int i:ans.keySet()){
            if(ans.get(i) == false){
                int k = i;
                int count = 1;

                while(ans.containsKey(k+1)){
                    k++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}