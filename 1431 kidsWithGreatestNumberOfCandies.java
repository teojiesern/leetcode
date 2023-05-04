class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = -1;
        List<Boolean> results = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(candies[i] > highest){
                highest = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            if((candies[i] + extraCandies) >= highest){
                results.add(true);
            }else{
                results.add(false);
            }
        }
        return results;
    }
}