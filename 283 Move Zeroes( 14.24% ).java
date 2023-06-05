class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> zero = new Stack<Integer>();
        LinkedList<Integer> num = new LinkedList<Integer>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) zero.push(nums[i]);
            else num.addLast(nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            if(!num.isEmpty()){
                nums[i] = num.removeFirst();
            }else{
                nums[i] = zero.pop();
            }
        }
    }
}