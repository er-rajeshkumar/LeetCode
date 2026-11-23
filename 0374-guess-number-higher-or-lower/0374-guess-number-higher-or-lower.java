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
        int mid = left + (right - left) / 2;
        int pick = guess(mid);
        while(pick != 0){
            if(pick == 1){
                left = mid+1;
            }else if(pick == -1){
                right = mid-1;
            }
            mid = left + (right - left) / 2;
            pick = guess(mid);
        }
        return mid;
    }
}