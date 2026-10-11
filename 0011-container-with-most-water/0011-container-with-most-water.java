class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int left = 0; 
        int right = n -1;
        int result = 0;
        while (left < right ){
            int width = right - left;
            int water = width * (Math.min(height[left], height[right]));
            if(water > result ){
                result = water;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;



        /* optimal but failed when input is 1 2 1
        int n = height.length;
        int maxH = height[0];
        int indexMinH = 0;
        int result = 0;
        for(int i = 1 ; i < n ; i++){
            int minH = Math.min(maxH, height[i]);
            int temp = minH * (i - indexMinH );
            if(temp > result){
                result = temp;
            }
            if(height[i] > maxH){
                maxH = height[i];
                indexMinH = i;
            }
        }
        return result;
        /* brute force 
        int n = height.length;
        int max = 0;
        for(int i = 0; i < n - 1 ; i++){
            for(int j = i + 1; j < n ; j++){
                int temp  = 0;
                int minH = Math.min(height[i] , height[j]);
                temp = minH * ( j - i);
                if(temp > max )
                    max = temp;
            }
        }
        return max;
        */
        
    }
}