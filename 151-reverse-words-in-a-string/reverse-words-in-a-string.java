class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split("\\s+");   //  \> skip , s> space, +> multiple
        String ans = "";

        for(int i=arr.length-1;i>=0;i--){
            if(ans==""){
                ans = ans+ arr[i];
            }
            else{
                ans = ans + " " + arr[i];
            }
        }
        return ans.trim();
    }
}

// //trim --> remove starting and last spaces

