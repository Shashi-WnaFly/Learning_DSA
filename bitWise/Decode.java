// Leetcode --> 1720. Decode XORed Array
class Decode {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] arr = new int[len+1];
        arr[0] = first;
        for(int i = 0; i < len; i++){
            arr[i+1] = encoded[i]^arr[i];
        }
        return arr;
    }
}
