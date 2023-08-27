package Learning_DSA.String;
// Leetcode --> 680. Valid Palindrome II

class Palindrome2 {
    public static boolean check(String s, int i){

        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(i);
        return (sb.toString().contentEquals(sb.reverse()));

    }
    public static boolean validPalindrome(String s) {

        int l = s.length()-1, i = 0;

        while(i <= l){

            if(s.charAt(i) != s.charAt(l)) {
                if(check(s, i)) return true;
                else  return check(s, l);
            }
            
            l--;
            i++;
        }
        return true;
    }
}
