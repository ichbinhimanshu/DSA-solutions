import java.util.*;

class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer> ans = new HashMap<>();
        int Lucky = 0;

        for(int i=0;i<arr.length;i++){
            if(!ans.containsKey(arr[i])){
                ans.put(arr[i],1);
            }
            else{
                ans.put(arr[i],ans.get(arr[i])+1);
            }
        }

        
        for(int key : ans.keySet()){
            if(key==ans.get(key)){
                if(key>Lucky){
                    Lucky = key;
                }
            }
        }

        if(Lucky == 0){
            Lucky = -1;
        }

        return Lucky;


            
    }
}