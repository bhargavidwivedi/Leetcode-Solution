class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
       while(columnNumber > 0){
       columnNumber -= 1;
       int remainder = columnNumber % 26;
       char letter = (char) (remainder + 65);
       sb.append(letter);
       columnNumber /= 26;
       }
       return sb.reverse().toString();

    }
}