// class Solution {
//     public String reverseWords(String s) {
//         String arr[] = s.split("\\s+");   //  \> skip , s> space, +> multiple
//         String ans = "";

//         for(int i=arr.length-1;i>=0;i--){
//             if(ans==""){
//                 ans = ans+ arr[i];
//             }
//             else{
//                 ans = ans + " " + arr[i];
//             }
//         }
//         return ans.trim();
//     }
// }

// //trim --> remove starting and last spaces


class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        StringBuilder ans = new StringBuilder();
        int j = s.length() - 1;

        while (j >= 0) {
            int i = j;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (ans.length() > 0) {
                ans.append(' ');
            }

            ans.append(s, i + 1, j + 1);

            // Skip spaces between words
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            j = i;
        }

        return ans.toString();
    }
}
