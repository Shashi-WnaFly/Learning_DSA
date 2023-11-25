// Leetcode --> 1486. XOR Operation in an Array
class XorInArr {
    public int xorOperation(int n, int start) {
        int res = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = start+2*i;
            res ^= arr[i];
        }
        return res;
    }
}
