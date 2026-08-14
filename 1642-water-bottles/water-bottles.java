class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int remaining = numBottles;
        while(remaining>=numExchange){
            int checker = remaining/numExchange;
            remaining = checker + (remaining%numExchange);
            drink = drink + checker;
        }
        return drink;
    }
}
