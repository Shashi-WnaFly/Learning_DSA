package DSA_Learning.Recursion;
// GFG --> Sum Triangle for given array

class TriSum {
    public long[] sumTri(long[] res, long[] arr, long n, int len){

        for(int j = (int)n; j >= 0; j--){
            res[--len] = arr[j];
        }

        for(int i = 0; i < n; i++){
            arr[i] = arr[i] + arr[i+1];
        }
        if(n == 0) return res;
        return sumTri(res, arr, --n, len);
    }

    public long[] getTriangle(long[] arr, long n){

        int len = 0;
        for(int i = (int)n; i >= 0; i--){
            len += i;
        }
        long[] res = new long[len];

        return sumTri(res, arr, --n, len);
    }
    
}
    // little different approach
class Compute {
    static ArrayList<Long> list = new ArrayList<>();
    
    public long[] getTriangle(long arr[], long n)
    {
        for(int i = (int)n-1; i >= 0; --i){
            list.add(arr[i]);
        }

        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i]+arr[i+1];
        }

        if(n > 1) return getTriangle(arr, --n);

        int s = list.size();
        long[] res = new long[s];
        int j = 0;
        
        for(int i=s-1; i>=0; --i){
            res[j++] = list.get(i);
        }
        list.clear();
        return res;
    }
}
