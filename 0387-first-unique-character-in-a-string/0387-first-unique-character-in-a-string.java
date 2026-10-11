class Solution {
    public int firstUniqChar(String s) {
 
        int n = s.length();
        if(n == 1){
            return 0;
        } else if(n == 0){
            return -1;
        }
        int[] arr = new int[26];
        for(int i = 0; i < n ; i++){
            arr[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n ; i++){
            if( arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}