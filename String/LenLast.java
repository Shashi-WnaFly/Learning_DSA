package Learning_DSA.String;
// Leetcode --> 58. Length of Last Word

class LenLast {
    public int lengthOfLastWord(String s) {
        int cnt = 0, i = s.length()-1;
        while(cnt <= 0){

            for(; i >= 0; i--){
                if(s.charAt(i) != ' '){
                    cnt++;
                }
                else{
                    break;
                }
            }
            i--;
        }
        return cnt;
    }
}
