package Learning_DSA.String;
// Leetcode --> 925. Long Pressed Name

class LongPressed {
    public boolean isLongPressedName(String name, String typed) {

        int n = name.length(), t = typed.length();
        int in = 0;
        boolean chk = true;
        if(name.charAt(0) != typed.charAt(0)) return false;
        for(int i = 0; i < n; i++){
        chk = false;
            for(int j = in; j < t; j++){
                if(name.charAt(i) == typed.charAt(j)){
                    chk = true;
                    in = j+1;
                    break;
                }
                else if(typed.charAt(j) != typed.charAt(in-1)) return false;
            }
            if(!chk){
                chk = false;
                break;
            } 
        }

        int id = in-1;

        if(chk){
            for(; in < t; in++){
            if(typed.charAt(id) != typed.charAt(in)) {
                chk = false;
                    break;
                }
            }
        }
        
        return chk;
    }
}
