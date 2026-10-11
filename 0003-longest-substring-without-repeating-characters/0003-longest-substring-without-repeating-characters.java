class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            char curr = s.charAt(right);
            if (map.containsKey(curr) && map.get(curr) >= left) {
                left = map.get(curr) + 1;
            }
            map.put(curr, right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
