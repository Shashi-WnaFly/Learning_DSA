package Learning_DSA.String;
// Leetcode --> 14. Longest Common Prefix

class LongPrefix {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        StringBuilder sb = new StringBuilder();

        if(strs[0].isEmpty()) return "";
        for(int i = 0; i < strs[0].length(); i++){

            int cnt = 0;
            char c = strs[0].charAt(i);

            for(int j = 0, k = i; j < n && k < strs[j].length(); j++){
                if(strs[j].charAt(k) == c){
                    cnt++;
                }
            }

            if(cnt == n){
                sb.append(strs[0].charAt(i));
            }
            else return sb.toString();

        }
        return sb.toString();
    }
}
