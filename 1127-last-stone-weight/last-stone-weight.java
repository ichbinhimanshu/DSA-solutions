class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        
        for(int i:stones){
            list.add(i);
        }

        if(list.size()==1){
            return list.get(0);
        }

        if(list.size()==2){
            return Math.abs(list.get(0) - list.get(1));
        }

        while(list.size()>1){
            int max = -1;
            int smax = -1;

            for(int i:list){
                if(i>max){
                    smax=max;
                    max=i;
                }
                else if(i>smax){
                    smax=i;
                }
            }

            int diff = max-smax;
            list.remove(Integer.valueOf(max));
            list.remove(Integer.valueOf(smax));


            if(diff>0){
                list.add(diff);
            }
        }
        if(list.isEmpty()){
            return 0;
        }
        else{
            return list.get(0);
        }
    }
}