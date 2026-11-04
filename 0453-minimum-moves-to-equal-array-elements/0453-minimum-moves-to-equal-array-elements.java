class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            result += (nums[i] - min);
        }
        return result;
    }
}