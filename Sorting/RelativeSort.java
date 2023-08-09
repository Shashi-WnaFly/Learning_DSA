package Learning_DSA.Sorting;
// Leetcode --> 1122. Relative Sort Array
class RelativeSort {

    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public static int[] sort(int[] arr, int s, int l){
        for(int i = s; i < l-1; i++){
            for(int j = i+1; j > s; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
                else break;
            }
        }
        return arr;
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int n1 = arr1.length, n2 = arr2.length, k = 0, l_index = n2;

        for(int i = 0; i < n2; i++){
            for(int j = k; j < n1; j++){
                if(arr1[j] == arr2[i]){
                    swap(arr1, k, j);
                    k++;
                    l_index = j+1;
                }
            }
        }
        sort(arr1, l_index, n1);
        return arr1;
    }
}
