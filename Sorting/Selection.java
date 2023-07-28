package Learning_DSA.Sorting;
import java.util.Arrays;

public class HelloWorld{
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            
            int max = -65000;
            int index = -1;
            
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

     public static void main(String []args){
         int[] arr = {2, 23, 11, 5, -19, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
     }
}
