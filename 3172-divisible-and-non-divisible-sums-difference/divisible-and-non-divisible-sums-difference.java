// class Solution {
//     public int differenceOfSums(int n, int m) {
//         int sum1=0;
//         int sum2=0;
        
//         for(int i=1;i<=n;i++){
//             if(i%m==0){
//                 sum2+=i;
//             }
//             else{
//                 sum1+=i;
//             }
//         }

//         return sum1-sum2;
//     }
// }

class Solution{
    public int differenceOfSums(int n, int m){
        int total = (n*(n+1))/2;
        int k = n/m;
        int m_divide = m*((k*(k+1))/2);
        int m_not_divide = total - m_divide;

        return m_not_divide - m_divide;
        
    }
}