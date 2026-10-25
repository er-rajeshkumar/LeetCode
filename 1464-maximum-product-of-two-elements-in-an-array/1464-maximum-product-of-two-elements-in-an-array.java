class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if( n == 2){
            return (nums[0] - 1) * (nums[1]- 1);
        }
        int max1 = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }else if(i  > max2){
                max2  = i;
            }
        }

        return (max1 - 1)* ( max2 - 1);


    }
}