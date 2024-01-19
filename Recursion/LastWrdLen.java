// GFG --> Length of Last word

class LastWrdLen
{ 
    static int lstWdLen(String s, int wl, int l){
        if(l < 0 || s.charAt(l) == ' ' && (wl > 0)) return wl;
        else if(s.charAt(l) != ' ') wl++;
        return lstWdLen(s, wl, --l);
    }
    int findLength(String s)
    {   
        int l = s.length();
        int wrdln = 0;
        return lstWdLen(s, wrdln, --l);
    }
}
