// Leetcode --> 868. Binary Gap
class BinGap {
    public int binaryGap(int n) {
        int max = 0, bit = 0;
        while(n > 0){
            int dis = 1;
            if(1 == (n&1)){
                bit++;
                n >>= 1;
                while(n > 0){
                    if(0 == (n&1)) dis++;
                    else break;
                    n >>= 1;
                }
            }
            else n >>= 1;
            if(max < dis){
                max = dis;
            }
        }
        if(bit == 1) return 0;
        return (max > 0) ? max : 0;
    }
}
