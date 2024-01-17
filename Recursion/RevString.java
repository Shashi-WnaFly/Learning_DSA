// Leetcode --> 344. Reverse String

class RevString {
    public void revArr(char[] s, int st, int ed){
        if(st > ed) return;
        
        char t = s[st];
        s[st++] = s[ed];
        s[ed--] = t;

        revArr(s, st, ed);
    }
    public void reverseString(char[] s) {
        int st = 0, ed = s.length-1;
        revArr(s, st, ed);
    }
}
