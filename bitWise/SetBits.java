// Leetcode --> 191. Number of 1 Bits
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int one_bit = 0;
        while(n != 0){
            one_bit++;
            n -= n & -n;
        }
        return one_bit;
    }
}