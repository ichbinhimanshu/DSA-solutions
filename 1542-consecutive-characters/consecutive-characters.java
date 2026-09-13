class Solution {
    public int maxPower(String s) {
        int max=1;
        int i=0;
        int count =1;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=1;
            }
            i++;
        }
        return max;
    }
}