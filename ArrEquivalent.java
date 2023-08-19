package Learning_DSA.String;
// Leetcode --> 1662. Check If Two String Arrays are Equivalent

class ArrEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String i : word1){
            s1.append(i);
        }

        for(String i : word2){
            s2.append(i);
        }
        
        return s1.toString().contentEquals(s2);
    }
}
