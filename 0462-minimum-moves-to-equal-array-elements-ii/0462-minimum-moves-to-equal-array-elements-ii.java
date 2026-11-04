class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = nums[(int)n/2];
        int result = 0;
        for(int i : nums){
            int diff = (i < median)? median - i : i - median;
            result += diff;
        }
        return result;
        /*
        long totalSum = 0;
        for(int i : nums){
            totalSum+= i;
        }
        int mean = (int)totalSum/nums.length;
        int result = 0;
        for(int i : nums){
            int diff = (i < mean)? mean - i : i - mean;
            result += diff;
        }
        return result;

        */
    }
}