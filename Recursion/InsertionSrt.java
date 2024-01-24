// GFG --> Insertion Sort

class InsertionSrt
{
  static void insert(int arr[],int i)
  {
       int t = arr[i];
       arr[i] = arr[i+1];
       arr[i+1] = t;
  }
  //Function to sort the array using insertion sort algorithm with recursion.
  public void insertionSort(int arr[], int n)
  {
      --n;
      if(n < 0) return;
      
      for(int i = n; i < arr.length-1; i++){
          if(arr[i] > arr[i+1]) insert(arr, i);
          else break;
      }
      
      insertionSort(arr, n);
  }
}
