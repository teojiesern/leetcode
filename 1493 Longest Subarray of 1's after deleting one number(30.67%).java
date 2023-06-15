class Solution {
    public int longestSubarray(int[] nums) {
        int delete = 1, count = 0, j=0, max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) count++;
            else delete--;
            // if case is still valid, which is only one element is being removed, record the highest number of consecutive ones
            if(delete >= 0)max = Math.max(max, count);
            else{
                if(nums[j] == 0) delete++;
                // since invald cases means that more than one zeros being removed, therefore the previous 1s are not to be taken into account anymore 
                else count--;
                j++;
            }
        }
        if(delete == 1) return nums.length - 1;
        return max;
    }
}