class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < arr2.length; i++){
            map.put(arr2[i], i);
        }

        int result = 0;
        for(int i = 0; i < arr1.length; i++){
            Integer ceil = map.ceilingKey(arr1[i]);
            Integer floor = map.floorKey(arr1[i]);

            int distCeil = (ceil != null) ? Math.abs(arr1[i] - ceil) : Integer.MAX_VALUE;
            int distFloor = (floor != null) ? Math.abs(arr1[i] - floor) : Integer.MAX_VALUE;

            int minDist = Math.min(distCeil, distFloor);

            if (minDist > d) {
                result++;
            }
        }
        return result;
    }
}