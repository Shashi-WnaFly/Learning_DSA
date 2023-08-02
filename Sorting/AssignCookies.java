package Learning_DSA.Sorting;
// Leetcode --> 455. Assign Cookies
// first approach and it takes 196ms using insertion sort
class AssignCookies {
    public static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else break;
            }
        }
        return arr;
    }
    public int findContentChildren(int[] g, int[] s) {

        sort(g);
        sort(s);

        int content = 0, j_pos = 0;

        for(int i = 0; i < g.length && i < s.length; i++){
            for(int j = j_pos; j < s.length; j++){
                if(s[j] >= g[i]){
                    content++;
                    j_pos = j+1;
                    break;
                }
            }
        }
        return content;
    }
}
