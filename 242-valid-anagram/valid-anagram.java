class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ans = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        else{
            for(char i : s.toCharArray()){
                if(!ans.containsKey(i)){
                    ans.put(i,1);
                }
                else{
                    ans.put(i,ans.get(i)+1);
                }
            }

            for(char i: t.toCharArray()){
                if(ans.containsKey(i)){
                    ans.put(i,ans.get(i)-1);
                }
                else{
                    return false;
                }
            }
        }
        
        for(int i:ans.values()){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}