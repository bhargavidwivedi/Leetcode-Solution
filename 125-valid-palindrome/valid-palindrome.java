class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
           char chr = Character.toLowerCase(ch);
           if(Character.isLetterOrDigit(chr)){
            sb.append(chr);
           }
        }
         String str = sb.toString();
         int left = 0; int right = str.length() - 1;

         while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
         }
         return true;
    }
}