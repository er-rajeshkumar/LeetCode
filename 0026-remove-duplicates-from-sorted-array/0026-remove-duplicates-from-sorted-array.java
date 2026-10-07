class Solution {
    public int removeDuplicates(int[] nums) {

        int unique = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[unique - 1]) {
                nums[unique++] = nums[i];
            }
        }

        return unique;
        // int unique = 0;
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     int curr = nums[i];
        //     nums[unique++] = curr;
        //     while (curr == nums[i]) {
        //         i++;
        //     }
        // }

        // return unique;
    }
}