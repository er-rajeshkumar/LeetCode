class Solution {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int max = 0;
        int left = 0;
        int right = 0;
        int zeros = 0;
        int n = nums.length;

        while (right < n) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max-1;
    }
}