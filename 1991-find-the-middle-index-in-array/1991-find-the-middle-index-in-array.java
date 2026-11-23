class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefix = 0;
        int suffix = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; ++i) {
        suffix -= nums[i];
        if (prefix == suffix)
            return i;
        prefix += nums[i];
        }

        return -1;

        // 283 / 294 testcases passed
        // int n = arr.length;
        // if( n < 2){
        //     return 0;
        // }
        // int prefix[] = new int[n];
        // prefix[0] = arr[0];
        // for(int i = 1; i < arr.length; i++){
        //     prefix[i] = prefix[i-1] + arr[i];
        // }
        // int sum = 0;
        // int result = 0;
        // for(int i = n - 1; i >= 0; i--){
        //     sum = sum + arr[i];
        //     if(sum == prefix[i] ){
        //         result =  i;
        //     }
        // }
        // return result == 0 ? -1 : result;
    }
}