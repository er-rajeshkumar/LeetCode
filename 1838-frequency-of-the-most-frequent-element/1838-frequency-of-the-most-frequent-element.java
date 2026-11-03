class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int result = 1;
        long sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
        /*
        int n = nums.length;
        if(n == 1){
            return 1;
        }

        Arrays.sort(nums);
        int result = 0;
        int left = 0, right = 1; 
        int totalOp = 0;
        int preSum = nums[1] - nums[0];
        while(right < n ){
            int counts = right - left;
            int curr = nums[right];
            int opNow = preSum + (counts)*(nums[right]-nums[right -1]);
            if(opNow < k){
                right++;
                preSum = opNow;
            }else{
                preSum = opNow - (nums[right] - nums[left]);
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;

        */
    }
}