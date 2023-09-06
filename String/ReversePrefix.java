package Learning_DSA.String;
// Leetcode --> 2000. Reverse Prefix of Word

class ReversePrefix {

    public String reversePrefix(String word, char ch) {
        
        int in = word.indexOf(ch);
        if(in < 0) return word;
        int i = 0;
        char[] c = word.toCharArray();
        while(i <= in){
            char t = c[i];
            c[i] = c[in];
            c[in] = t;
            i++;
            in--;
        }
        return new String(c);
    }
}
