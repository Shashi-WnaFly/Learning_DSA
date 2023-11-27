// Leetcode --> 1684. Count the Number of Consistent Strings
class Consistent {
    public int countConsistentStrings(String allowed, String[] words) {
        // int res = 0;
        // int l = words.length;
        // int ls = allowed.length();
        // for(int i = 0; i < l; i++){
        //     int li = words[i].length();
        //     int match = 0;
        //     for(int j = 0; j < li; j++){
        //         for(int k = 0; k < ls; k++){
        //             if(words[i].charAt(j) == allowed.charAt(k)) match++;
        //         }
        //     }
        //     if(match == li) res++;
        // }
        // return res;

        // second Approach
        int cnt = 0;
        int ls = allowed.length();
        int[] arr = new int[26];
        for(int i = 0; i < ls; i++){
            arr[allowed.charAt(i) - 'a']++; 
        }
        for(String word : words){
            int l = word.length();
            for(int i = 0; i < l; i++){
                if(arr[word.charAt(i) - 'a'] == 0){
                    cnt++;
                    break;
                }
            }
        }
        
        return words.length - cnt;
    }
}
