class Solution {
    public int bulbSwitch(int n) {
        int count=0;
        int i=1;
        int j=1;
        while(i*j<=n){
            count++;
            i++;
            j++;
        }
        return count;
    }
}