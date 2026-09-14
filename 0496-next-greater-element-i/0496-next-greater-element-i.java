class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int result[] = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int temp = 0;
        boolean needToVisit = false;
        outerLoop:
        for(int i = 0; i< n ; i++){ 

            int curr = nums1[i];
            InnerLoop:
            for(int j = 0; j < m; j++){
                if(nums2[j] == nums1[i]){
                  // System.out.println(nums1[i] + " is found at " + j);
                    temp = j;
                    while(temp < m){
                        if(nums1[i] < nums2[temp]){
                            result[i] = nums2[temp];
                          //  System.out.println(nums1[i] + " updated " +  nums2[temp]);
                            break InnerLoop;
                        }
                        temp++;
                    }
                    
                }
            }
        }


        return result;
    }
}