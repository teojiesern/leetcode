class Solution {
    public boolean increasingTriplet(int[] nums) {
        int lowest = Integer.MAX_VALUE, secLowest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
          if(nums[i]<=lowest)lowest = nums[i];
          else if(nums[i]<=secLowest)secLowest = nums[i];
          //no matter if later we have any value that is smaller than the lowest, if the upcoming number has a number that is larger than the seclowest number, it will always be larger than the initial smallest following the index rule
          else return true;
        }
        return false;
    }
}