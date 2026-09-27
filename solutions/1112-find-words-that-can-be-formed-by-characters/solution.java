class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> masterMap = new HashMap<>();

        for(char c: chars.toCharArray()) {
            masterMap.put(c, masterMap.getOrDefault(c, 0) + 1);
        }

        int totalLength = 0;

        for(String word: words) {
            HashMap<Character, Integer> tempMap = new HashMap<>(masterMap);
            boolean canForm = true;

            for(char c : word.toCharArray()) {
                if(!tempMap.containsKey(c) || tempMap.get(c) == 0) {
                    canForm = false;
                    break;
                }

                tempMap.put(c, tempMap.get(c) - 1);
            }

            if(canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;


    }
}
