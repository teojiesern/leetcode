class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE, i=0, j=0, sum=0;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k) j++;
            else if(j-i+1 == k){
                max = Math.max(max, sum);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return (double)max/k;
    }
}