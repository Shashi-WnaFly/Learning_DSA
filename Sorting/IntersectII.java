package Learning_DSA.Sorting;
// Leetcode --> 350. Intersection of Two Arrays II
// using insertion sort
class IntersectII {

    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
                if(!swapped) break;
            }
        }
        return arr;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        
        int k = 0, j_pos = 0;
        sort(nums1);
        sort(nums2);
        
        int[] intersection = new int[1001];
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = j_pos; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    intersection[k++] = nums1[i];
                    j_pos = j+1;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, k);
        }
}
