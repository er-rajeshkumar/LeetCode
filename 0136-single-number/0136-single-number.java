class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            result = nums[i] ^ result;
        }
        return result;
    }
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int n : nums){
    //         if(set.contains(n)){
    //             set.remove(n);
    //         }else{
    //             set.add(n);
    //         }
    //     }
    //     for(int n : set){
    //         return n;
    //     }
    //     return 0;
    // }
}