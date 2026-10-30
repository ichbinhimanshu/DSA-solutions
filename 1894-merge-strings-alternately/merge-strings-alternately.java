class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        char[] ans = new char[word1.length() + word2.length()];

        int i=0;
        int j=0;
        int k=0;
        
        while(j<arr1.length && k<arr2.length){
            if(i%2==0){
                ans[i]=arr1[j];
                j++;
            }
            else{
                ans[i]=arr2[k];
                k++;
            }
            i++;
        }

        while(k<arr2.length){
            ans[i]=arr2[k];
            i++;
            k++;
        }

        while(j<arr1.length){
            ans[i]=arr1[j];
            i++;
            j++;
        }

        return new String(ans);
    }
}