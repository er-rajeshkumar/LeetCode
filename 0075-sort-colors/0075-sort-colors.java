class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int onces = 1;
        int twos = 2;
        for(int i : nums){
            if(i == 0){
                zeros++;
            }
            else if (i == 1){
                onces++;
            }
            else{
                twos++;
            }
        }
        for(int i = 0; i < zeros; i++){
            nums[i] = 0;
        }
        for(int i = zeros; i < zeros +onces - 1; i++ ){
            nums[i] = 1;
        }
        for(int i = zeros+onces - 1; i < nums.length; i++ ){
            nums[i] = 2;
        }
    }
}