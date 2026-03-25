class Solution {
    public int dominantIndex(int[] nums) {
        
        int n = nums.length;
        int maxValue = nums[0];
        int maxIndex = 0;

        for(int i = 1; i<n; i++){
            if(nums[i] > maxValue){
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i<n; i++){
            if( i != maxIndex && maxValue < 2*nums[i]){
                return -1;
            }
        }
        return maxIndex;
    }
}