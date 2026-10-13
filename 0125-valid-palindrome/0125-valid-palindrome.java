class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(char ch : lower.toCharArray()){
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        System.out.print(sb);
        int n = sb.length();
        for(int i = 0; i < n/2; i++){
            if(sb.charAt(i) != sb.charAt( n - i - 1))
                return false;
        }
        return true;
    }
}