class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n <2)
            return 0;
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        int minimumTillDate = prices[0];
        for(int i = 0; i < n; i++){
            max = Math.max(prices[i], max);
            min = Math.min(prices[i], min);
            profit = Math.max(profit, prices[i] - min);   
                     
        }
        return profit;
    }
}