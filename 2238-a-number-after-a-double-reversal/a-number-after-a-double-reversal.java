class Solution {
    public boolean isSameAfterReversals(int num) {
        int x=num%10;
        if(num==0){
            return true;
        }
        if(x==0){
            return false;
        }
        
        return true;
    }
}