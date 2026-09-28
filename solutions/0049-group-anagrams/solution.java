class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            String key = sortString(word);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(word);
        }

        return listResult(map);
    }

    private List<List<String>> listResult(HashMap <String, List<String>> map) {
        List<List<String>> result = new ArrayList<>();

        for(List<String> anagram : map.values()) {
            result.add(anagram);
        }

        return result;
    }

    private String sortString(String word) {
        char[] cArr = word.toCharArray();
        Arrays.sort(cArr);
        return new String(cArr);
    }
}
