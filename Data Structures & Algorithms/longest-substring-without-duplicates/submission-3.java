class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        int l = 0;
        int r = 1;
        int longestSubstring = 0;
        Set<Character> currentSet = new HashSet<>();
        currentSet.add(s.charAt(l));
        while(r < s.length()){

            if(currentSet.contains(s.charAt(r))){
                // compute longest value 
                longestSubstring = Math.max(longestSubstring, currentSet.size());
                currentSet.remove(s.charAt(l));
                l = l + 1;
            }
            else {
                currentSet.add(s.charAt(r));
                r = r + 1;
            }
        }
        longestSubstring = Math.max(longestSubstring, currentSet.size());
        return longestSubstring;
    }
}
