class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zeros = n;
        int temp = 0;
        for(int i = 0; i < n; i++){
            if (nums[i] == 0 ){
                zeros++;
            }else{
                nums[temp++] = nums[i];
            }
        }
        for(int i = temp; i < n; i++){
            nums[i] = 0;
        }
    }
}