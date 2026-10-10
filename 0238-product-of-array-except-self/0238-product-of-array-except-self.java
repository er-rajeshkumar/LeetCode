class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        int n = nums.length;
        boolean containZero = false;
        boolean doubleZeros = false;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                product *= nums[i];
            }else{
                if (containZero){
                    doubleZeros = true;
                }
                containZero = true;
            }
        }
    
        int [] result = new int[n];
        if(doubleZeros){
            return result;
        }
        for(int i = 0; i < n; i++){
            if(containZero){
                if(nums[i] == 0){
                    result[i] =(int) product;
                }
            }else{
                result[i] = (int)product/ nums[i];
            }
        }
        return result;
    }

}