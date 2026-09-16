class Solution {
    public int compress(char[] chars) {
       StringBuilder sb = new StringBuilder();
       int count=1;
       for(int i=0;i<chars.length;i++){
        while(i<chars.length-1 && chars[i]==chars[i+1]){
            count++;
            i++;
        }
        sb.append(chars[i]);
        if(count>1){
            sb.append(count);
            count=1;
        }
       }

       //now copy sb data in chars list
       for(int i=0;i<sb.length();i++){
        chars[i]=sb.charAt(i);
       }


       
       return sb.length();
    }
}