//  1835. Find XOR Sum of All Pairs Bitwise AND
class H_XorSum {
    public int getXORSum(int[] arr1, int[] arr2) {
        return (xor(arr1)&xor(arr2));
    }
    private int xor(int[] ar){
        int s = 0;
        for(int i : ar){
            s ^= i;
        }
        return s;
    }
}
