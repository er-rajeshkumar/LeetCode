class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        int temp = 0;
        boolean visited[] = new boolean[n];

        for(int i = 0; i <n; i++){

            if( !visited[i] ){
                char currCharS = s.charAt(i);
                char currCharT = t.charAt(i);
                temp = i;
                while (temp < n){
                    if(s.charAt(temp) == currCharS){
                        if(t.charAt(temp) != currCharT ){
                            return false;
                        }
                        else{
                            visited[temp] = true;
                        }  
                    }
                    if(t.charAt(temp) == currCharT){
                        if(s.charAt(temp) != currCharS ){
                            return false;
                        }
                        else{
                            visited[temp] = true;
                        }
                    }
                    temp++;
                }
            }
        }
        return true;
    }
}