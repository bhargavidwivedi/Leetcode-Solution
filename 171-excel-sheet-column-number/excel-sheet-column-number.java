class Solution {
    public int titleToNumber(String columnTitle) {
        
        int result = 0;
       for(char chr : columnTitle.toCharArray()){
        result = result * 26 + (chr - 'A' + 1);
       } 
       return result;
    }
}