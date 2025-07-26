class Solution {
    public int maxArea(int[] height) {
    Scanner sc = new Scanner(System.in);
    int n = height.length;
    int maxArea = 0;
    int currentArea = 0;
    int i = 0; int  j = n-1;
    while(i < j)  {
       int  width = j - i;
       currentArea = width * Math.min(height[i],height[j]); 
       maxArea = Math.max(maxArea,currentArea);
       if(height[i] < height[j]){
         i++;
       }else{
        j--;
       }
    }
    return maxArea;
    }
}