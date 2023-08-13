package Learning_DSA.Sorting;
// Leetcode --> 1502. Can Make Arithmetic Progression From Sequence
class Solution {
    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length, i = 0, j;
        for(; i < n-1; i++){
            for(j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else break;
            }
        }
        int diff = arr[1] - arr[0];
        for(i = 0; i < n-1; i++){
            if(arr[i+1] - arr[i] != diff) return false;
        }
        return true;
    }
}
