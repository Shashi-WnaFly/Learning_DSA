// Leetcode --> 476. Number Complement
class NumCompliment {
    public int findComplement(int num) {
        int[] arr = new int[32];
        int i = 31, res = 0;
        while(num != 0){
            int bit = num&1;
            if(bit == 1) arr[i--] = 0;
            else arr[i--] = 1;
            num >>= 1;
        }
        i = 31;
        for(int j = 0; j < 32; j++){
            if(arr[i--] == 1) res += Math.pow(2, j);
        }
        return res;
    }
}
