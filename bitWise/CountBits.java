// Leetcode --> 338. Counting Bits

class CountBits {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 1; i <= n; i++){
            int one = 0;
            int j = i;
            while(j != 0){
                j -= j & (-j);
                one++;
            }
            arr[i] = one;
        }
        return arr;
    }
}
