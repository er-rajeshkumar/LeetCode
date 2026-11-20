class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map =new HashMap<>();
        for(int i : nums){
            // set.add(i);
            map.put(i, map.getOrDefault(i, 0)+ 1);
        }
        int count = 0;
        for(int key : map.keySet()){
            if(map.containsKey(k - key)){
                count = count + Math.min(map.get(key), map.get(k - key));
            }
        }

        return count/2;
    }
}