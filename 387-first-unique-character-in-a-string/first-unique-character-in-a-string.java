class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> unique = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!unique.containsKey(c)){
                unique.put(c,1);
            }
            else{
                unique.put(c,unique.get(c)+1);
            }
        }
        for(char key : s.toCharArray()){
            if(unique.get(key)==1){
                return s.indexOf(key);
            }
        }
        return -1;
    }
}