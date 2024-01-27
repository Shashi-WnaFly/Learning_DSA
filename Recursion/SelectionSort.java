// GFG --> Selection Sort
class SelectionSort{
public static void selection(int[] ar, int n, int j, int max){
        if(n == 0) return;
        if(j<n){
            if(ar[j] > ar[max]){
                selection(ar, n, j+1, j);
            }
            else{
                selection(ar, n, j+1, max);
            }
        }
        else{
            int t = ar[n-1];
            ar[n-1] = ar[max];
            ar[max] = t;
            selection(ar, --n, 0, 0);
        }
    }
}
