class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int n : nums1){
            map1.put(n , map1.getOrDefault(n, 0)+1);
        }
        List<Integer> list = new ArrayList<>(); 
        for(int n : nums2){
            if(map1.containsKey(n)){
                list.add(n);
                int count = map1.get(n);
                if(count == 1){
                    map1.remove(n);
                }else{
                    map1.put(n , map1.get(n)-1);
                }
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}