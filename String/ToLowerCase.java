package Learning_DSA.Sorting;
// Leetcode --> 709. To Lower Case

lass ToLowerCase {
    public String toLowerCase(String s) {

        int n = s.length();
        StringBuilder mut = new StringBuilder();

        for(int i = 0; i < n; i++){
            int val = s.charAt(i);
            if(val > 64 && val < 91){
                val += 32;
            }
            mut.append((char)val);
        }
        return mut.toString();
    }

}
