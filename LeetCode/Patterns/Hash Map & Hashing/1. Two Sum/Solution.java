class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] result = new int[2];
        int n = nums.length;
        for(int i = 0;i < n; i++){
           map.put(nums[i], i);
        }
        for(int i = 0; i <n; i++){
            if(map.containsKey(target - nums[i])){
                int n1 = map.get(target - nums[i]);
                int n2 = i;
                if( n1 == n2){
                    continue;
                }
                return new int[] {n1, n2};
            }
        }
        return result;
    }
}