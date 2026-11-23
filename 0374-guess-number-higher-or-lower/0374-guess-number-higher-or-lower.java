/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        int pick = guess((right + left)/2);
        while(pick != 0){
            if(pick == 1){
                left = (right + left)/2+1;
            }else if(pick == -1){
                right = (right + left)/2-1;
            }
            pick = guess((right + left)/2);
        }

        return (right + left)/2;
    }
}