package Learning_DSA.String;
// Leetcode --> 657. Robot Return to Origin
class RobotMove {
    public boolean judgeCircle(String moves) {
        // int L = 0, U = 0, D = 0, R = 0, n = moves.length();
        // for(int i = 0; i < n; i++){
        //     switch(moves.charAt(i)){
        //         case 'L': L++;
        //         break;
        //         case 'D': D++;
        //         break;
        //         case 'U': U++;
        //         break;
        //         case 'R': R++;
        //     }
        // }
        // return (L == R && U == D);
        // ***** second solution ************
        int[] s = new int[21];
        char[] moc = moves.toCharArray();
        for(char c : moc){
            s[c - 65]++;
        }
        return (s[11] == s[17] && s[20] == s[3]);
    }
}
