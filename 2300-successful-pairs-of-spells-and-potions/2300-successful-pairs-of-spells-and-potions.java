class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] result = new int[n];

        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int curr = spells[i];

            int left = 0;
            int right = potions.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if ((long) curr * potions[mid] >= success) {
                    right = mid - 1; // Search for an earlier successful potion
                } else {
                    left = mid + 1;   // Search to the right
                }
            }

            result[i] = potions.length - left;
        }

        return result;
    }
}