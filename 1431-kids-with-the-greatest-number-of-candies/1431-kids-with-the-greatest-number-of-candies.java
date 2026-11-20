class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int m : candies){
            max = Math.max(max, m);
        }
        List<Boolean> list = new ArrayList<Boolean>();
        for(int m : candies){
            if(m + extraCandies >= max ){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}