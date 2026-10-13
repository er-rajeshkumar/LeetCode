class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
        return ;
        int p1 = m-1, p2 = n-1, p3 = m+n-1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p3--] = nums1[p1--];
            } else {
                nums1[p3--] = nums2[p2--];
            }
        }

        while (p2 >= 0) {
            nums1[p3--] = nums2[p2--];
        }

        /*
        List<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < m && p2 < n){
                if(nums1[p1] < nums2[p2] ){
                    list.add(nums1[p1++]);
                }else  if(nums1[p1] > nums2[p2]){
                    list.add(nums2[p2++]);
                } else{
                    list.add(nums1[p1++]);
                    list.add(nums2[p2++]);
                }
            
        }
        while (p2 < n) {
            list.add(nums2[p2++]);
        }
        while (p1 < m) {
            list.add(nums1[p1++]);
        }


        for(int i = 0; i < m + n ; i++){
            nums1[i] = list.get(i);
        }
        */
    }
}