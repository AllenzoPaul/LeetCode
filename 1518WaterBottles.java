class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int n = numBottles/numExchange;
        int r = numBottles%numExchange;
        while(n>=1){
            total = total + n;
            int empty = n+r;
            n = empty/numExchange;
            r = empty%numExchange;
        }
        return total;
    }
}