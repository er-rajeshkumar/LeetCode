class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(curr <= first){
                first = curr;
            }else if (curr <= second ){
                second = curr;
            }else{
                return true;
            }
        }
        return false;


        // TLE
        // int n = nums.length;
        // int mini = nums[0];
        // for(int i = 0; i < n-2; i++){
        //     mini = Math.min(mini, nums[i]);
        //     if(nums[i] > mini){
        //         continue;
        //     }
        //     for(int j = i+1; j < n-1; j++){
        //         if(nums[i] < nums[j]){
        //             for(int k = j+1; k < n; k++){
        //                 if(nums[i] < nums[j] && nums[j] < nums[k]){
        //                     return true;
        //                 }
        //             }
        //         }
        //         mini = Math.min(mini, nums[i]);
        //     }
        // }


        // return false;
    }
}