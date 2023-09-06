package Learning_DSA.String;
// Leetcode --> 1704. Determine if String Halves Are Alike

mport java.util.Arrays;
class HalvesAlike {
    public int vowel(char[] s){
        int cnt = 0;
        char[] vo = {'a','e','i','o','u'};
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < 5; j++){
                if(vo[j] == s[i]) cnt++;
            }
        }
        return cnt;
    }
    public boolean halvesAreAlike(String s) {

        int n = s.length(), i = 0;
        String sl = s.toLowerCase();
        char[] sc = sl.toCharArray();

        return vowel(Arrays.copyOfRange(sc, 0, n/2)) == vowel(Arrays.copyOfRange(sc, n/2, n));
    }
}
