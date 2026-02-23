import java.util.Arrays;
class Solution {
    public int arrayPairSum(int[] nums) {
      int n = nums.length;
      int maxSum = 0;

      Arrays.sort(nums);

      for(int i = 0; i<n; i+=2){
        maxSum += nums[i];
      }
      return maxSum;
    }
}