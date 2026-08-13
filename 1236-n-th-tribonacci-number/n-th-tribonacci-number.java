class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        else{
            int f=0;
            int s=1;
            int t=1;

            for(int i=n;i>0;i--){
                int forth = f+s+t;
                f=s;
                s=t;
                t=forth;
            }
            return f;
        }
    }
}