package DSA;

public class Pangram {
    public static boolean checkIfPangram(String sentence) {
        char[] pan = new char[26];
        boolean pangram;
        int k = 0;
        for (int i = 0; i < sentence.length(); i++) {
            boolean check = true;
            for (int j = 0; j < 26; j++) {
                if (pan[j] == sentence.charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                pan[k] = sentence.charAt(i);
                k++;
            }
        }
        pangram = pan.length == k;
        return pangram;
    }

    public static void main(String[] args) {
        String sentence = "anmt";
        boolean check = checkIfPangram(sentence);
        System.out.println(check);
        System.out.println(sentence.length());
    }
}
