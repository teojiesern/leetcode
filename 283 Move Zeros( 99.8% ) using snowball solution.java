class Solution {
    public void moveZeroes(int[] nums) {
        int snowBall = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                snowBall++;
            }else if(snowBall > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-snowBall] = temp;
            }
            // if the snowball is not rolled, meaning that the first element we encounter is not a zero, we would not do anything in that iteration thus the element will stay at its place
        }
    }
}