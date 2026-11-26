class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int countBeautifulPairs(int[] nums) {
        int count = 0 ;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                
                int first = nums[i];
                while(first>9){
                    first=first/10;
                }
                int last = nums[j]%10;

                if(gcd(first,last)==1){
                    count++;
                }
            }
        }
        return count;
    }
}