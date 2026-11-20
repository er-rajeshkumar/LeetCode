class Solution {
    public static boolean isVowel(char ch){
        //return if vowel
        String str = "aeiouAEIOU";
        int idx = str.indexOf(ch);
        return (idx == -1)? false : true;
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        int prev = count;
        for(int i = k; i < s.length(); i++){
            int temp = prev;
            char curr = s.charAt(i);
            char left = s.charAt(i - k);
            if(isVowel(curr)){
                temp++;
            }
            if(isVowel(left)){
                temp--;
            }
            prev = temp;
            count = Math.max(temp, count);
        }


        return count;
    }
}