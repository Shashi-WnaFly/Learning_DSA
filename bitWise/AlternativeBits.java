// Leetcode --> 693. Binary Number with Alternating Bits
class AlternativeBits {
    public boolean hasAlternatingBits(int n) {
        while(n > 0){
            int altNum = n&1;
            n = n>>1;
            if(altNum == (n&1)) return false;
        }
        return true;
    }
}
