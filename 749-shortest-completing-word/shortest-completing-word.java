class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        int [] licenseCount = new int[26];
        for(char c : licensePlate.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                 licenseCount[c-'a']++;
            }
        }

        String result = null;
        for(String word : words){
            int [] wordCount = new int[26];
            for(char c : word.toLowerCase().toCharArray()){
                wordCount[c-'a']++;
            }
            boolean completes = true;
            for(int i = 0; i < 26; i++){
                if(wordCount[i] < licenseCount[i]){
                    completes = false;
                    break;
                }
            }
            if(completes){
                if(result == null || word.length() < result.length()){
                    result = word;
                }
            }
        }
        return result;
    }
}