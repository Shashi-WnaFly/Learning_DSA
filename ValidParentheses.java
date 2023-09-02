package Learning_DSA.String;
// Leetcode --> 20. Valid Parentheses

class ValidParentheses {
    public boolean isValid(String s) {
        String[] srr = {"(]", "(}", "[)", "[}", "{)", "{]"};

        for(int i = 0; i < 6; i++){
            if(s.contains(srr[i])) return false;
        }

        int len = 0;
        while(len != s.length()){
            len = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }

        return s.length() == 0;
    }
}
