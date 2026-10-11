class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int pre = 0;

        for(int i =1; i < n ; i++){
            int temp = prices[i] - prices[pre++];
            if(temp > 0)
                profit += temp;
        }
        return profit;
    }
}