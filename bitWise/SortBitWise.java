// Leetcode --> 1356. Sort Integers by The Number of 1 Bits
class SortBitWise {
    static void sort(int[] ar){
        int l = ar.length-1;
        for(int i = 0; i < l; i++){
            for(int j = i+1; j > 0; j--){
                if(ar[j] < ar[j-1]){
                    int t = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = t;
                }
                else break;
            }
        }
    }
    static void sort(int[] ar, int[] bit){
        int l = ar.length-1;
        for(int i = 0; i < l; i++){
            for(int j = i+1; j > 0; j--){
                if(bit[j] < bit[j-1]){
                    int t = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = t;
                    t = bit[j-1];
                    bit[j-1] = bit[j];
                    bit[j] = t;
                }
                else break;
            }
        }
    }
    public int[] sortByBits(int[] arr) {
        sort(arr);
        int l = arr.length;
        int[] ar2 = arr.clone();
        for(int i = 0; i < l; i++){
            int bit = 0;
            while(ar2[i] > 0){
                ar2[i] -= ar2[i] & -ar2[i];
                bit++;
            }
            ar2[i] = bit;
        }
        sort(arr, ar2);
        return arr;
    }
}
