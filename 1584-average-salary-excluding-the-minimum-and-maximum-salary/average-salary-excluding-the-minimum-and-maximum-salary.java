class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
        }

        int j=0;
        int ans=0;
        while(j<salary.length){
            if(salary[j]==max || salary[j]==min){
                j++;
            }
            else{
                ans=ans+salary[j];
                j++;
            }
        }

        return (double) ans/(salary.length-2);
    }
}