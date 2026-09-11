// class Solution {
//     public int lengthOfLastWord(String s) {
//         String word[] = s.split(" ");
//         return word[word.length-1].length();
//     }
// }
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                i--;
            }
            else{
                break;
            }
        }

        while(i>=0 && s.charAt(i)!=' '){
            len++;
            i--;
        }
        return len;
    }
}