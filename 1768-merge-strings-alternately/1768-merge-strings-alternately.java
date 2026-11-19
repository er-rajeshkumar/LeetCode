class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = 0, n2 =0;
        while(n1 < word1.length() &&  n2< word2.length()){
            sb.append(word1.charAt(n1++));
            sb.append(word2.charAt(n2++));
        }
        while(n1 < word1.length()){
            sb.append(word1.charAt(n1++));
        }
        while(n2 < word2.length()){
            sb.append(word2.charAt(n2++));
        }
        return sb.toString();
    }
}