class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int rem = n - k;
        int temp = 0;
        int[] copy = Arrays.copyOf(nums, nums.length);
        
        for(int i = 0; i < n; i++){
            temp = (i + k ) %n;
            nums[temp] = copy[i];
        }
    }
}