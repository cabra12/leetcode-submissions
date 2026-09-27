class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        String[] wordsArray = s.split(" ");
        char[] charArray = pattern.toCharArray();

        if(wordsArray.length != charArray.length) return false;
        
        for(int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            String word = wordsArray[i];

            if(map.containsKey(c)) {
                if(!map.get(c).equals(word)) return false;
            } else {
                if(usedWords.contains(word)) return false;
                map.put(c, word);
                usedWords.add(word);
            }

        }

        return true;
    }
}
