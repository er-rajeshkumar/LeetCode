class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int i = 0;
        int n = nums.length;
        int range = 0;

        int left = 0, right = 0;
        while(right < n ){
            int curr = nums[right] - nums[left];
            if(curr <= 2*k){
                right++;
            }else{
                left++;
            }
            result = Math.max(result, right - left);
        }

        return result;
        /*
        int result = 0;
        int i = 0;
        int n = nums.length;
        int range = 0;
        while(i < n){
            int count = 0;
            range = nums[i] + 2*k;
            while(i < n && nums[i] <= range){
                i++;
                count++;
            }
            result = Math.max(count, result);
        }
        return result;


        */
    }
}