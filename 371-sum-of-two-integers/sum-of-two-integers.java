class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
        //a=001 , b=011
        //ans = 100
        int xor = a^b;  //010          //000       //100
        int and = a&b;  //001          //010       //000
        int carry = and << 1; //010    //100       //000

        a=xor; //010                   //000       //100
        b=carry; //010                 //100       //000
        }
    return a;
    }
}