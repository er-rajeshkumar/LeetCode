class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        
        int maxIdx = 0;
        for(int i = 0; i <n ;i++){
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
        }
        return maxIdx;
        
    }
}