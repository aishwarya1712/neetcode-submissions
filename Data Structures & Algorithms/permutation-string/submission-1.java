class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        String s1Key = getKeyRepresentation(s1);
        int l = 0;
        int r = l + s1.length() - 1;
        while(r < s2.length()){
            String currentSubstringKey = getKeyRepresentation(s2.substring(l, r + 1));
            if(currentSubstringKey.equalsIgnoreCase(s1Key)){
                return true;
            }
            l++;
            r++;
        }
        return false;
    }

    private String getKeyRepresentation(String s){
        // abc -> #1a#1b#1c
        // lecabee -> #1a#1b#1c#3e#1l
        int[] key = new int[26];
        String keyString = "";
        for(int i = 0; i < s.length(); i++){
            key[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(key[i] > 0){
                String append = "#" + key[i] +  String.valueOf((char) (i + 'a'));
                keyString += append;
            }
        }
        return keyString;
    }
}
