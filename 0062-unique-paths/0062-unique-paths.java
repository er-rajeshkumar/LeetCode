class Solution {
    // Solution correct but giving TLE 
    // public static int countPath(int m, int n, int currM, int currN){
    //     if(currM == m - 1 && currN == n - 1){
    //         return 1;
    //     }
    //     if(currM >= m || currN >= n){
    //         return 0;
    //     }
    //     int down = countPath(m, n, currM + 1, currN);
    //     int right = countPath(m, n, currM, currN + 1 );
    //     return right + down;

    // }

    public static int countPath(int m, int n, int currM, int currN, int[][] dp) {

        if (currM == m - 1 && currN == n - 1) {
            return 1;
        }

        if (currM >= m || currN >= n) {
            return 0;
        }

        if (dp[currM][currN] != -1) {
            return dp[currM][currN];
        }

        int down = countPath(m, n, currM + 1, currN, dp);
        int right = countPath(m, n, currM, currN + 1, dp);

        return dp[currM][currN] = down + right;
    }
    public int uniquePaths(int m, int n) {
        // return countPath(m,n,0,0);
        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return countPath(m, n, 0, 0, dp);
    }
}