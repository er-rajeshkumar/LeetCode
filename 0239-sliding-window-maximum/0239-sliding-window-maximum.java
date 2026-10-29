class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(k == 1){
            return nums;
        }
        int[] result = new int[n - k +1];
        int sum = 0;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int  i = 0; i < k; i++) {
            int curr = nums[i];
            queue.offerLast(curr);
            if(curr > firstLargest ){
                secondLargest = firstLargest;
                firstLargest = curr;
            }else if (curr > secondLargest ){
                secondLargest = curr;
            }
        }
        result[0] = firstLargest;
        for(int i = k ; i <n; i++){
            queue.offerLast(nums[i]);
            int pollElement = queue.pollFirst();
            if(pollElement == firstLargest){
                firstLargest = secondLargest;
            }
            int curr = nums[i];
            if(curr > firstLargest ){
                secondLargest = firstLargest;
                firstLargest = curr;
            }else if (curr > secondLargest ){
                secondLargest = curr;
            }
            result[i - k + 1] = firstLargest;
        }
        return result;
    }
}