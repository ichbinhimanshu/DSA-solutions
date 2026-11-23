class Solution {
    public boolean checkString(String s) {
        boolean flag = false;
        for (char i : s.toCharArray()) {
            if (i == 'b') {
                flag = true;
            } else if (i == 'a' && flag == true) {
                return false;
            }
        }
        return true;
    }
}