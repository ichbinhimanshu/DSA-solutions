class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        

        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                sb1.append(Character.toLowerCase(i));
            }
        }
        
        StringBuilder sb2 = new StringBuilder(sb1);
        sb2.reverse();

        return sb2.toString().equals(sb1.toString());
    }
}