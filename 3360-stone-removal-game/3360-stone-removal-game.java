class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10 || n > 55){
            return false;
        }
        boolean  aliceTurn = true;
        int count = 10;
        while( n > 0){
            if(aliceTurn){
                n = n - count--;
                if( n < count){
                    return true;
                }
                aliceTurn  = false;
            }
            else{
                n = n - count--;
                if( n < count){
                    return false;
                }
                aliceTurn = true;
            }
        }

        return true;
    }
}