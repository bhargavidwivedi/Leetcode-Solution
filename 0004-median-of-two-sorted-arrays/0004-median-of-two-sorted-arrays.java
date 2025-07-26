class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      Scanner sc = new Scanner (System.in);
      int m = nums1.length;
      int n = nums2.length;
      double median = 0.0;
      int[] mergedArray = new int [m+n];
      int  len = mergedArray.length;
      int i = 0;  int k = 0; int j = 0;
      while( i < nums1.length && j < nums2.length)
      if(nums1[i] < nums2[j]){
      mergedArray[k++] = nums1[i++]; 
      }
     else
     {
        mergedArray[k++] = nums2[j++];
     }
      while(i < nums1.length) mergedArray[k++] = nums1[i++];
      while(j < nums2.length) mergedArray[k++] = nums2[j++];
      if(mergedArray.length % 2 == 0){
        median = (mergedArray[len/2] + mergedArray[len/2-1]) / 2.0;
      } else{
        median = mergedArray[len/2];
      }
      return median;
    }
}