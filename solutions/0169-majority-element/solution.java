class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int numToReturn = 0;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums) {
            if(map.get(num) > (nums.length / 2)) {
                numToReturn = num;
            }
        }

        return numToReturn;
    }
}
