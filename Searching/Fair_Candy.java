package Learning_DSA.Searching;
// Leetcode --> 888. Fair Candy Swap
import java.util.Arrays;
class Fair_Candy {
    public int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public int search_item (int[] arr, int item){
        int s = 0, e = arr.length-1, mid;

        while(s <= e){
            mid = s + (e - s)/2;
            if(arr[mid] == item) return mid;

            else if(arr[mid] < item) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int val = (sum(aliceSizes) - sum(bobSizes))/2;

        Arrays.sort(aliceSizes);

        for(int b : bobSizes){
            if(search_item(aliceSizes, val + b) != -1){
                return new int[] {val + b, b};
            }
        }
        return null;
    }
}
