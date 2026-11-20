class Solution {
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer(s);
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                list.add(ch);
            }
        }
        int len = list.size() - 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                sb.setCharAt(i , list.get(len--));
            }
        }
        return sb.toString(); 
    }
}