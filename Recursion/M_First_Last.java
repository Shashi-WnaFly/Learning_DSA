// Leetcode --> 34. Find First and Last Position of Element in Sorted Array
class M_First_Last {
    private int[] search4(int[] arr, int trt, int s, int e, int i){
        if(s > e && i == -1) return new int[] {-1,-1};
        int m = s + (e-s)/2;
        if(s > e){
            int l = i;
            for(int j = i; j<arr.length; ++j){
                if(arr[j] == trt) l = j;
            }
            return new int[] {i, l};
        }
        if(arr[m] == trt){
            e = m-1;
            i = m;
        }
        else if(arr[m] > trt) e = m-1;
        else s = m+1;
        return search4(arr, trt, s, e, i);
    }
    public int[] searchRange(int[] ar, int target) {
        return search4(ar, target, 0, ar.length-1, -1);
    }
}
