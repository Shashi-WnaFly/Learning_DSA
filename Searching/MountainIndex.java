package Learning_DSA.Searching;

// Leetcode --> 852. Peak Index in a Mountain Array

public class MountainIndex {
    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0, end = arr.length-1, mid;
        int max = 0;

        while(start <= end){

            mid = start + (end - start)/2;

            if(arr[mid] >= arr[max] && arr[mid] > arr[mid+1]){
                max = mid;
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(array));
    }
}
