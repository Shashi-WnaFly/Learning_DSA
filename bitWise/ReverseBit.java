// Leetcode --> 190. Reverse Bits
public class ReverseBit {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int[] arr = new int[32];
        int res = 0, j = 0, c = n;

        while(n != 0){
            arr[j] = n&1;
            n = n>>>1;
            j++;
        }

        int p = 0;
        for(int i = 31; i >= 0; i--, p++){
            if(arr[i] == 1) res += (int)Math.pow(2, p);
        }
        if(res < 0) return res+1;
        if(c == 1) return res+1;
        return res;
    }
}
