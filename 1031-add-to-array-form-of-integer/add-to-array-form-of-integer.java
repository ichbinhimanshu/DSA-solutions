// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> ans = new ArrayList<>();
//         int i = num.length - 1;
//         int carry = 0;

//         while(i>=0 || k>0){
//             int sum = carry;
//             if(i >= 0){
//                 sum+=num[i--];
//             }
//             if(k>0){
//                 sum+=k%10;
//                 k/=10;
//             }
//             ans.add(sum%10);
//             carry = sum/10;
//         }
//         if(carry>0){
//             ans.add(carry);
//         }

//         Collections.reverse(ans);
//         return ans;
//     }
// }














class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p = num.length-1;
        int carry = 0;

        while(p>=0 || k>0){
            int sum = carry;       // if i = -1 so it give error so we need some value atleast

            if(p>=0){             //only i-- when need
                sum = sum + num[p];
                p--;
            }
            if(k>0){
                sum = sum + (k%10);
                k=k/10;
            }

            ans.add(sum%10);
            carry = sum/10;
        }

        if(carry>0){                        // first digit if we have carry left add it
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }
}