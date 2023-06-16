class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for(int num: nums) totalSum += num;
        if(totalSum - nums[0] == 0) return 0;
        for(int i=1; i<nums.length; i++){
            leftSum += nums[i-1];
            if(leftSum == totalSum - leftSum - nums[i]) return i;
        }   
        return -1;     
    }
}