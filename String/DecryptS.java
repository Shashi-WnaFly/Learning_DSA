package Learning_DSA.String;
// Leetcode --> 1309. Decrypt String from Alphabet to Integer Mapping

class DecryptS {
    
    public String freqAlphabets(String s) {

        StringBuilder sh = new StringBuilder();
        int i = s.length()-1;

       while(i >= 0){
           int chval = 0;
           if(s.charAt(i) == '#'){
               
               chval = (s.charAt(i-2)-48)*10 + s.charAt(i-1)-48;
               i -= 3;
           }
           else{
               chval = (s.charAt(i)-48);
               i--;
           }
            sh.append((char)(chval + 96));
       }
       return sh.reverse().toString();
    }
}
