class Solution {
    public int minimumCost(int[] cost) {
        int totalCost = 0;
        Arrays.sort(cost);
        int iterater = 1;
        // Loop backwards, processing chunks of 3 elements at a time
        // If there are 3 items left, we buy the two largest (i and i-1) and skip the third (i-2)
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            totalCost += cost[i]; // Add the largest available
            
            if (i - 1 >= 0) {
                totalCost += cost[i - 1]; // Add the second largest available
            }
            // The third item at cost[i - 2] is skipped automatically by the loop update (i -= 3)
        }
        return totalCost;
    }
}