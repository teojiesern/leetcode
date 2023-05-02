class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        int tempResult = 0;
        int result[] = new int[2];
        for(int i=0; i<nums.length; i++){
            tempResult = target - nums[i];
            if(hmap.get(tempResult) == null){
                hmap.put(nums[i],i);
            }else{
                result[0] = i;
                result[1] = hmap.get(tempResult);
                break;
            }
        }
        return result;
    }
}