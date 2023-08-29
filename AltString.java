package Learning_DSA.String;
Leetcode --> 1768. Merge Strings Alternately

class AltString {
    public String mergeAlternately(String word1, String word2) {

        int w1 = word1.length(), w2 = word2.length(), j = 0, k = 0;
        int n = (w1 > w2) ? w1 : w2;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < w1+w2; i++){
            if((i%2 == 0 || k >= w2) && j < w1){
                sb.append(word1.charAt(j));
                j++;
            }
            else{
                sb.append(word2.charAt(k));
                k++;
            }
        }
        return sb.toString();
    }
}
