class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length(), n2 = t.length();
        int i = 0;
        int j = 0;
        outlerLoop:
        for(char ch : s.toCharArray()){
            boolean found = false;
            innerLoop:
            while(j < n2){
                if(t.charAt(j) == ch){
                    found = true;
                    j++;
                    break innerLoop; 
                }else{
                    j++;
                }
            }
            if(!found){
                return false;
            }
        }

        return true;
    }
}