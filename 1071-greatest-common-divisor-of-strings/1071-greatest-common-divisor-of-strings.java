class Solution {
    public static boolean isDiviorString(String s, String prefix){
        int p = prefix.length();
        int n = s.length();
        if(n%p != 0){
            return false;
        }
        int curr = 0;
        while (curr< n){
            if(!prefix.equals(s.substring(curr, curr + p)))
                return false;
            curr += p;
        }
        return true;
    }
    public String gcdOfStrings(String str1, String str2) {
        
        // make sure which is smaller in length 
        int n1 = str1.length(), n2 = str2.length();
        if(str1.equals(str2)){
            return str1;
        }
        if(n1 < n2){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        //first find common prefix of both 
        StringBuilder prefix = new StringBuilder(str2);
        for(int i = prefix.length(); i >0; i--){
            if(str1.startsWith(prefix.toString())){
                if(isDiviorString(str1, prefix.toString()) && isDiviorString(str2, prefix.toString()) ){
                    return prefix.toString();
                }
            }
            prefix.deleteCharAt(prefix.length() - 1);
        }
        // while(!str1.startsWith(prefix.toString()) && prefix.length() > 0){
        //     prefix.deleteCharAt(prefix.length() - 1);
        // }
        
        
        return new String();
    }
}