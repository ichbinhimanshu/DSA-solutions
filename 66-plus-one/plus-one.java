class Solution {
    public int[] plusOne(int[] digits) {
        int p = digits.length-1;
        int carry = 0;
        if(digits[p]!=9){
            digits[p] = digits[p]+1;
            return digits;
        }
        else{
            while(p>=0){
                if(digits[p]==9){
                    digits[p]=0;
                    p--;
                }
                else{
                    digits[p]=digits[p]+1;
                    return digits;
                }
            }
        }

        int ans[]=new int[digits.length+1];
        ans[0] = 1;
        return ans;

    }
}