package Learing_DSA.String;
// Leetcode --> 1616. Split Two Strings to Make Palindrome

class MSplit2Palin {
    public boolean checkPalindromeFormation(String a, String b) {
        StringBuilder sa = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        if(a.contentEquals(sa.reverse())) return true;
        if(b.contentEquals(sb.reverse())) return true;
        int n = a.length();
        StringBuilder pa = new StringBuilder();
        StringBuilder pb = new StringBuilder();
        
        for(int i = 1; i < n; i++){
            sa = new StringBuilder(a.substring(i,n));
            sb = new StringBuilder(b.substring(i,n));
            pa.append(a.charAt(i-1));
            pb.append(b.charAt(i-1));
            StringBuilder w = new StringBuilder(pb+sa.toString());
            StringBuilder q = new StringBuilder(pa+sb.toString());
            if((pb+sa.toString()).contentEquals(w.reverse())) return true;
            if((pa+sb.toString()).contentEquals(q.reverse())) return true;
        }
        return false;
    }
    
    // Second Approach _________________________
    public boolean checkPalindrome(String a, int l, int r){
        while(l < r){
            if(a.charAt(l) != a.charAt(r)) break;
            l++;
            r--;
        }
        return l >= r;
    }
    public boolean checkPalindrome(String a, String b){
        int l = 0, r = a.length()-1;
        while(l < r){
            if(a.charAt(l) != b.charAt(r)) break;
            l++;
            r--;
        }
        return checkPalindrome(a, l, r) || checkPalindrome(b, l, r);
    }
    public boolean checkPalindromeFormation(String a, String b) {

        return checkPalindrome(a, b) || checkPalindrome(b, a);
    }
}
