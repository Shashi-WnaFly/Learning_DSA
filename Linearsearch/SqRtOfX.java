package DSA.Linearsearch;

// Leetcode --> 69. Sqrt(x)
public class SqRtOfX {
    public static int mySqRt(int x){

        int s = 1, end = x, mid, res = 0;

        while(s <= end){
            mid = s + (s - end)/2;
            if(mid <= x/mid) {
                s = mid + 1;
                res = mid;
            }

            else {
                end = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int x = 2147395600;
        System.out.println(mySqRt(x));
    }
}
