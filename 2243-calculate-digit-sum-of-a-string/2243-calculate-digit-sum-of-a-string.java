class Solution {
    public static String countOf(String n){
        long r = 0;
        for(char ch : n.toCharArray()){
            r = r + (ch - '0'); 
        }
        return Long.toString(r);
    }
    public String digitSum(String s, int k) {
        StringBuffer sb = new StringBuffer(s);
        int n = s.length();
        while(sb.length() > k){
            sb.delete(0, sb.length());
            for(int i = 0; i < n ; i = i+k){
                String div = s.substring(i , Math.min(i+k, n));
                sb.append(countOf(div));
            }
            s = sb.toString();
            n = sb.length();
        }
        return sb.toString();
    }
}