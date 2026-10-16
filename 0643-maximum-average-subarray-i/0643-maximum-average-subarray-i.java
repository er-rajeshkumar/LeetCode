class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int left = 0;
        int right = k;
        int n = nums.length;
        for(int i = 0; i < k ; i++){
            sum += nums[i];
        }
        double maxSum = sum;
        while(right < n){
            sum = sum + nums[right] - nums[left];

            maxSum = Math.max(maxSum, sum);

            right++;
            left++;
        }
        return maxSum  / k;

    }
}