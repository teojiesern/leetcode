class Solution {
    public int longestOnes(int[] A, int K) {
        int left = 0, right, max = 0, zero = 0;
        for(right = 0; right<A.length; right++){
            if(A[right] == 0) zero++;
            if(zero > K){
                //when num of zero more than k, it will become invalid and our sliding window will try its best to make it valid by keep finding the zero in the left to minus it
                if(A[left] == 0) zero--;
                left++;
            }else max = Math.max(max, right - left + 1);
            // the max will only be updated if the expression is valid in which the zero is less than or equal to K, and since we want to find the number in the range, need to plus one
        }
        return max;
    }
}