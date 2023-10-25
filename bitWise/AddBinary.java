// Leetcode --> 67. Add Binary

class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ab = new StringBuilder(a);
        StringBuilder bb = new StringBuilder(b);
        int i = a.length();
        int j = b.length();
        if (i - j > 0) {
            int l = i - j;
            for (int k = 0; k < l; k++) {
                bb.insert(0, '0');
            }
        }
        if (j - i > 0) {
            int l = j - i;
            for (int k = 0; k < l; k++) {
                ab.insert(0, '0');
            }
        }
        i = ab.length()-1;
        j = bb.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            if (ab.charAt(i) == '1' && carry == 1) {
                if (bb.charAt(j) == '1') {
                    sb.insert(0, '1');
                } else {
                    sb.insert(0, '0');
                }
            } else if (ab.charAt(i) == '0' && carry == 1) {
                if (bb.charAt(j) == '1') {
                    sb.insert(0, '0');
                } else {
                    sb.insert(0, '1');
                    carry = 0;
                }
            } else if (ab.charAt(i) == '1' && bb.charAt(j) == '1') {
                sb.insert(0, '0');
                carry = 1;
            } else {
                if (ab.charAt(i) == '0' && bb.charAt(i) == '0') sb.insert(0,'0');
                else sb.insert(0, '1');
            }
            i--;
            j--;
        }
        if (carry == 1) sb.insert(0, '1');
        return new String(sb);
    }
}
