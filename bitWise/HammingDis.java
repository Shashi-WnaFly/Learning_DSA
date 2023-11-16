// Leetcode --> 461. Hamming Distance
class HammingDis {
    public int hammingDistance(int x, int y) {
        int pos = 0;
        while(x != 0 || y != 0){
            int n = x&1;
            int n2 = y&1;
            if(n != n2) pos++;
            y >>= 1;
            x >>= 1;
        }
        return pos;
    }
}
