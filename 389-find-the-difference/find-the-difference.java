class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character , Integer> tbox = new HashMap<>();
        HashMap<Character , Integer> sbox = new HashMap<>();

        for(char i : s.toCharArray()){
            if(!sbox.containsKey(i)){
                sbox.put(i,1);
            }
            else{
                sbox.put(i,sbox.get(i)+1);
            }
        }
        for(char i : t.toCharArray()){
            if(!tbox.containsKey(i)){
                tbox.put(i,1);
            }
            else{
                tbox.put(i,tbox.get(i)+1);
            }
        }

        for(char key : tbox.keySet()){
            if(!sbox.containsKey(key)){
                return key;
            }
            if(tbox.get(key) > sbox.get(key)){
                return key;
            }
        }
        return 'H';
    }
}