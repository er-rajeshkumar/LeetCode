class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {

            if (flowerbed[i] == 0) {

                // Check left neighbor
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);

                // Check right neighbor
                boolean rightEmpty = (i == len - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant flower
                    n--;

                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}