class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Sliding window
        int result = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        int n = nums.length;
        while (right < n) {
            sum += nums[right];

            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left];
                left++;
            }

            right++;
        }

        return result == Integer.MAX_VALUE ? 0 : result;

        //TLE
        /*
        int result = Integer.MAX_VALUE;

        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum = 0;
            innerLoop:
            for(int j = i; j < n ; j++){
                sum += nums[j];
                if(sum >=target ){
                    result = Math.min(result, j-i + 1);
                    break innerLoop;
                }
            }
        }
        if(result == Integer.MAX_VALUE)
            return 0;
        return result;

        */
    }
}