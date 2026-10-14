class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int [] result = new int[n];
        int temp = 0;
        for(int i= 0; i < n; i++){
            int curr = nums[i];
            if(curr != val){
                result[temp ++] = curr;
            }
        }

        for(int i = 0; i < n; i++){
            nums[i] = result[i];
        }
        return  temp;
    }
}