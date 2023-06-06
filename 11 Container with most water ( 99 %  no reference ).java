class Solution {
    public int maxArea(int[] height) {
        int highestArea = 0, i=0, j=height.length-1, tempArea;
        while(i<j){
            if(height[i] > height[j]){
                tempArea = (j - i) * height[j];
                j--;
            }else{
                tempArea = (j - i) * height[i];
                i++;
            }
            highestArea = highestArea > tempArea ? highestArea : tempArea;
        }
        return highestArea;
    }
}