class Solution {
    public int majorityElement(int[] nums) {

        //Boyer–Moore Voting Algorithm
        int count = 1;
        int candidate = nums[0] ;
        for(int i = 1; i < nums.length ; i++){
            int curr = nums[i];
            if(count == 0){
                candidate = curr;
            }
            if(curr == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;


        /*
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i < n; i++){
            int count = map.getOrDefault(nums[i], 0)+1;
            if(count > n/2) return nums[i];
            map.put(nums[i], count);
        } 
        // for(Integer key : map.keySet()) {
        //     int count = map.get(key);
        //     if(count > n/2){
        //         return key;
        //     }
        // }
        return 0;

        */
    }
}