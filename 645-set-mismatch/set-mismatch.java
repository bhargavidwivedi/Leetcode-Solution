class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) == 2){
                duplicate = num;
            }
        }

        for(int i = 1; i<=n; i++){
            if(!map.containsKey(i)){
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}