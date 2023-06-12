class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int count = 0;
        double average = -Double.MAX_VALUE, countSum = 0;
        for(int i=0; i<nums.length; i++){
            countSum += nums[i];
            count++;
            if(count >= k){
                if(countSum/k > average) average = countSum/k;
                countSum = countSum - nums[i+1-k];
            }
        }
        return average;
    }
}