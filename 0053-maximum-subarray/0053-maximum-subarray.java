class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n <= 0)
            return 0;
        int curr = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }

        return max;
    }
}