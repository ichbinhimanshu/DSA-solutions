class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;

        for(char i:s.toCharArray()){
            if(i=='('){
                st.push(i);
            }
            else if(st.size()>0 && st.peek()=='('){
                st.pop();
            }
            else{
                count++;
            }
        }
        return count+st.size();   
    }
}