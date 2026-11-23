class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefix = 0;
        int n = nums.length;
        int suffix = Arrays.stream(nums).sum();
        int[] result = new int[n];
        for(int i = 0; i < n ; i++){
            suffix -= nums[i];
            result[i] = Math.abs(suffix - prefix);
            prefix +=  nums[i];
        }
        return result;
    }
}