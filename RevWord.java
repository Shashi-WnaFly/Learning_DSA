package Learning_DSA.String;
// Leetcode --> 557. Reverse Words in a String III

class RevWord {
    public String reverseWords(String s) {

        StringBuilder revWd = new StringBuilder();

        for(String i : s.split(" ")){ // here what split does split the substring when it encounter with space character and store it in i without space character

            StringBuilder sb = new StringBuilder(i);//each substring converted to StringBuilder to manupulate character with the same object or easily

            revWd.append(sb.reverse());// reverse it and at the same time append it tp StringBuilder ref.
            revWd.append(" ");
        }
        revWd.deleteCharAt(revWd.length()-1);// because we append " " after every subtring this going to be add extra space at last so, delete last character.
        return new String(revWd); // return as String
    }
}
