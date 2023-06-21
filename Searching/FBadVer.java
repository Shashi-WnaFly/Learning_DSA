package DSA.Searching;
// Leetcode --> 278. First Bad Version

public class FBadVer {
    public static int firstBadVersion(int n) {

        int s = 1, end = n, mid;

        while(s < end){

            mid = s + (end - s)/2;

//            if(isBadVersion(mid)){ // return true or false
//                end = mid;
//            }
//            else{
//                s = mid + 1;
//            }
        }
        return s;
    }

    public static void main(String[] args) {
        int TotalProduct = 30;
        System.out.print("Bad products starts from ");
        System.out.print(firstBadVersion(TotalProduct));

    }
}
