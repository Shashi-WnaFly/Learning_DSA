// GFG --> Upper case conversion

class EchUpper
{
    public String transform(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.insert(0,(char)(s.charAt(0)-32));
        
        return echCap(sb, 1, s.length()-1);
    }
    static String echCap(StringBuilder s, int st, int l){
        if(st == l) return s.toString();
        
        if(s.charAt(st) == ' '){
            if(s.charAt(st+1) > 122 || s.charAt(st+1) < 97);
            
            else{
                char c = (char)(s.charAt(st+1)-32);
                s.deleteCharAt(st+1);
                s.insert(st+1, c);
            }
        }
        return echCap(s, ++st, l);
    }
}
