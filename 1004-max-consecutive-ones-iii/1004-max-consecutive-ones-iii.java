class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int zeros = 0;
        int n = nums.length;

        while (right < n) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}


// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int max = 0;
//         int left = 0;
//         int right = 0;
//         int zeros = 0;
//         int n = nums.length;
//         while(right < n){
//             int curr = nums[right];
//             if(curr == 1){
//                 right++;
//             }
//             else{
//                 if(zeros < k){
//                     right++;
//                 }else{
//                     while(left < right && nums[left] == 1){
//                         left++;
//                     }
//                     zeros--;
//                 }
//             }
//             max = Math.max(max, right - left );
//         }
//         return max;
//     }
// }