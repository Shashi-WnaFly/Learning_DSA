package Learning_DSA.String;
// Leetcode --> 344. Reverse String

class ReverseS {
    public void reverseString(char[] s) {
        int n = s.length, l = s.length-1;
        for(int i = 0; i < n/2; i++){
            char t = s[l];
            s[l] = s[i];
            s[i] = t;
            l--;
        }
    }
}
