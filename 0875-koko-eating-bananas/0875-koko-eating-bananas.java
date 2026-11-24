class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int i : piles){
            high = Math.max(high, i);
        }

        while(low <= high){
            long totalHours = 0;
            int mid = low + (high - low )/2;
            for(int i : piles){
                totalHours += (i + mid - 1) / mid;
            }
            if(totalHours <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}