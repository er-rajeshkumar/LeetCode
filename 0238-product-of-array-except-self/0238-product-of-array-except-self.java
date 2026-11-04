class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];
        long multi = 1;
        
        for(int i = 0; i < n; i++){
            multi *= nums[i];
            prefix[i] = multi;
        }
        long[] suffix = new long[n];
        multi = 1;
        for(int i = n-1; i >0; i--){
            multi *= nums[i];
            suffix[i] = multi;
        }
        int [] result = new int[n];
        result[0] = (int)suffix[1];
        result[n-1] = (int)prefix[n-2];
        for(int i = 1; i < n-1; i++){
            result[i] = (int)(prefix[i-1] * suffix[i+1]);
        }
        return result;

    }
}
        /*
        long product = 1;
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

*/