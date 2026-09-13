class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split("\\s+");   //  \> skip , s> space, +> multiple
        StringBuilder ans = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            if(ans.length()>0){
                ans.append(" ");
            }
            ans.append(arr[i]);
        }
        return ans.toString().trim();
    }
}

// //trim --> remove starting and last spaces

