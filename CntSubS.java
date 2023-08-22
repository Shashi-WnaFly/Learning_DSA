package Learning_DSA.String;
// Leetcode --> 1967. Number of Strings That Appear as Substrings in Word
class CntSubS {
    // public boolean sub(String b, String c){
    //     int bl = b.length(), cl = c.length();
    //     for(int i = 0; i < bl; i++){
    //         if(c.charAt(0) == b.charAt(i)){
    //             try{
    //                 if(c.equals(b.substring(i, (cl+i)))) return true;
    //             }catch (Exception e){
    //                 return false;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public int numOfStrings(String[] patterns, String word) {
        int cnt= 0;
        // for(String i : patterns){
        //     boolean ch = sub(word, i);
        //     if(ch) cnt++;
        // }
        
        // ******* second solution ********
        
        for(String i : patterns){
            boolean ch = word.contains(i);
            if(ch) cnt++;
        }
        return cnt;
    }
}
