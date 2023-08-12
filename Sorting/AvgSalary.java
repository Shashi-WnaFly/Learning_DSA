package Learning_DSA.Sorting;
// Leetcode --> 1491. Average Salary Excluding the Minimum and Maximum Salary

class Solution {
    
    public static int index(int[] arr, int l){

        int n = arr.length, max_i = -1, max = 999;

        for(int i = 0; i < l; i++){ // find max index
            if(arr[i] > max){
                max = arr[i];
                max_i = i;
            }
        }
        return max_i;
    }

    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public double average(int[] salary) {
        int n = salary.length, i = 0;
        int min = 100001, min_i = -1;
        double sum = 0;
        swap(salary, index(salary, n), n-1); // max index swap with last index

        for(; i < n-1; i++){ // find min index
            if(salary[i] < min){
                min = salary[i];
                min_i = i;
            }
        }

        swap(salary, min_i, n-2); // min index swap with second last index

        for(i = 0; i < n-2; i++){
            sum += salary[i];
        }
        return (sum / (n-2));
    }
}
