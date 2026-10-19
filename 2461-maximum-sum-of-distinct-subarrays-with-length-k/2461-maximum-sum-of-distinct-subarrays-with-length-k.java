
import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        long sum = 0;
        long maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];

            sum += curr;
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);

            if (right - left + 1 > k) {
                int outgoing = nums[left];
                sum -= outgoing;

                freq.put(outgoing, freq.get(outgoing) - 1);
                if (freq.get(outgoing) == 0) {
                    freq.remove(outgoing);
                }

                left++;
            }

            if (right - left + 1 == k && freq.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
