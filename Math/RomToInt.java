// Leetcode --> 13. Roman to Integer
class RomToInt {
    public int romanToInt(String s) {
        int total = 0;
        int l = s.length()-1;
        
        for(int i = l; i >= 0; i--){
            
            if(s.charAt(i) == 'I'){
                total += 1;
            }
            else if(s.charAt(i) == 'V'){
                if(i != 0 && s.charAt(i-1) == 'I'){
                    total += 4;
                    i--;
                }
                else total += 5;
            }
            else if(s.charAt(i) == 'X'){
                if(i != 0 && s.charAt(i-1) == 'I'){
                    total += 9;
                    i--;
                }
                else total += 10;
            }
            else if(s.charAt(i) == 'L'){
                if(i != 0 && s.charAt(i-1) == 'X'){
                    total += 40;
                    i--;
                }
                else total += 50;
            }
            else if(s.charAt(i) == 'C'){
                if(i != 0 && s.charAt(i-1) == 'X'){
                    total += 90;
                    i--;
                }
                else total += 100;
            }
            else if(s.charAt(i) == 'D'){
                if(i != 0 && s.charAt(i-1) == 'C'){
                    total += 400;
                    i--;
                }
                else total += 500;
            }
            else if(i != 0 && s.charAt(i-1) == 'C'){
                total += 900;
                i--;
            }
            else total += 1000;
        }
        return total;
    }
}
