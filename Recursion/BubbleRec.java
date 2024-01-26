// GFG --> Bubble Sort Using recursion
class BubbleRec
{
    public static void swap(int[] ar, int n, int j){
        if(n == 0) return;
        if(j < n){
            if(ar[j] > ar[j+1]){
                int t = ar[j+1];
                ar[j+1] = ar[j];
                ar[j] = t;
            }
            swap(ar, n, j+1);
        }
        else swap(ar, n-1, 0);
        
    }
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {  
        swap(arr, --n, 0);
    }
}
