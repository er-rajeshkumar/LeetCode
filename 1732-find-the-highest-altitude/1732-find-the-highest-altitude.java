class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int g = 0;
        for(int i  = 0; i < gain.length; i++){
            g = g + gain[i];
            max = Math.max(g, max);
        }
        return max;
    }
}