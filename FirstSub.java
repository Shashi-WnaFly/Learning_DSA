package Learning_DSA.String;
// Leetcode --> 28. Find the Index of the First Occurrence in a String
class FirstSub {

    public int strStr(String haystack, String needle) {

        int n = haystack.length(), n2 = needle.length();
        char b = needle.charAt(0);

        for(int i = 0; i < n; i++){

            if(haystack.charAt(i) == b){
                int g = n2+i;
                if(g > n) break;
                if(needle.equals(haystack.substring(i, g))) return i;
            }
        }
            // if(haystack.contains(needle)) return haystack.indexOf(needle);
        return -1;
    }
}
