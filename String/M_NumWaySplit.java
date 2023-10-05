package Learning_DSA.String;
// 1573. Number of Ways to Split a String

class Solution {

  // _______ this solution is TLE
    public static int numWays(String s) {
        int mod = 1_000_000_007;
        int count_1 = 0;
        int n = s.length();
        ArrayList<Integer> bin = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            count_1 += s.charAt(i) - '0';
            bin.add(count_1);
        }
        int numWays = 0;
        if (count_1 % 3 != 0) return numWays;
        else {
            count_1 /= 3;
            for (int i = 0; i < n && bin.get(i) <= count_1 ; i++) {
                if (bin.get(i) == count_1) {
                    for (int j = i + 1; j < n && bin.get(j) <= (count_1 * 2); j++) {
                        if (bin.get(j) == count_1 * 2){
                            for (int k = j + 1; k < n && bin.get(k) <= (count_1 * 3); k++) {
                                if (k == n-1) numWays++;
                            }
                        }
                    }
                }
            }
        }
        return numWays % 10000);
    }
}
