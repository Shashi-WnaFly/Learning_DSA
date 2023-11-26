// Leetcode --> 1684. Count the Number of Consistent Strings
class Consistent {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        int l = words.length;
        int ls = allowed.length();
        for(int i = 0; i < l; i++){
            int li = words[i].length();
            int match = 0;
            for(int j = 0; j < li; j++){
                for(int k = 0; k < ls; k++){
                    if(words[i].charAt(j) == allowed.charAt(k)) match++;
                }
            }
            if(match == li) res++;
        }
        return res;
    }
}
