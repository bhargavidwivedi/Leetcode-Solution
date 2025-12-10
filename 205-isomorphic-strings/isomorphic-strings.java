class Solution {
    public boolean isIsomorphic(String s, String t) {
        Scanner sc = new Scanner(System.in);

        int [] sFirst = new int[256];
        int [] tFirst = new int [256];
        Arrays.fill(sFirst, -1);
        Arrays.fill(tFirst, -1);

        for(int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sFirst[sChar] != tFirst[tChar]){
                return false;
            }else{
                sFirst[sChar] = i;
                tFirst[tChar] = i;
            }
        }
        return true;
    }
}