class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
       
        if(nums1.length <1 || nums2.length < 1){
            return new int[0];
        }
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if( set1.contains(nums2[i])){
                list.add(nums2[i]);
                set1.remove(nums2[i]);
            }
        }

        int[] result = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return result;
    }
}