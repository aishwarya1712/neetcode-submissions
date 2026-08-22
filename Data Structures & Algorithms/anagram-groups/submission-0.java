class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String currString = strs[i];
            
            int[] keyMap = new int[26];

            for(int j = 0; j < currString.length(); j++){
                int idx = currString.charAt(j) - 'a';
                keyMap[idx] += 1;
            }

            String key = "";
            for(int k = 0; k < keyMap.length; k++){
                key = key + "#" + keyMap[k];
            }
            if(map.get(key) != null){
                List<String> currList = map.get(key);
                currList.add(currString);
                map.put(key, currList);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(currString);
                map.put(key, newList);
            }
            
        }

        List<List<String>> output = new ArrayList<>();
        for(String key: map.keySet()){
            List<String> val = map.get(key);
            output.add(val);
        }
        return output;
    }
}
