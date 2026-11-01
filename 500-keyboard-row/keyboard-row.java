class Solution {
    public String[] findWords(String[] words) {
        ArrayList<Character> r1 = new ArrayList<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        ArrayList<Character> r2 = new ArrayList<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        ArrayList<Character> r3 = new ArrayList<>(Arrays.asList('z','x','c','v','b','n','m'));

        ArrayList<String> ans = new ArrayList<>();

        for(String word:words){
            String word1 = word.toLowerCase();
            boolean valid = true;

            for(char letter:word1.toCharArray()){
                if(!r1.contains(letter)){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans.add(word);
                continue;
            }

            valid = true;
            for(char letter:word1.toCharArray()){
                if(!r2.contains(letter)){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans.add(word);
                continue;
            }

            valid = true;
            for(char letter:word1.toCharArray()){
                if(!r3.contains(letter)){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans.add(word);
            }

        }
        String[] result = new String[ans.size()];
        
        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }

        return result;
    }
}