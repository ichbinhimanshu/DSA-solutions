class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        

        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                sb1.append(Character.toLowerCase(i));
            }
        }

        int i=0;
        int j=sb1.length()-1;
        while(i<=j){
            if(sb1.charAt(i)==sb1.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}