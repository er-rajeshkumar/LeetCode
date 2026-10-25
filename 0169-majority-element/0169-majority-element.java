class Solution {
    public int majorityElement(int[] nums) {
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
    }
}