class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] s_array = new int[26];
        int[] t_array = new int[26];

        for(int i = 0; i < s.length(); i++){
            int s_val = s.charAt(i) - 'a';
            int t_val = t.charAt(i) - 'a';
            s_array[s_val] += 1;
            t_array[t_val] += 1;
        }
        
        for(int i = 0; i < 26; i++){
            System.out.println("s char is: " + s_array[i] +" and t char is: " + t_array[i]);
            if(s_array[i] != t_array[i]){
                return false;
            }
        }
        return true;
    }
}
