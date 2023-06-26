package Learning_DSA.Searching;

// Leetcode --> 367. Valid Perfect Square

public class PerfectSq {
    public boolean isPerfectSquare(int num) {

        int left = 1, right = num, mid;

        while(left <= right){

            mid = left + (right - left)/2;

            if((float)mid == (float)num/mid) return true;

            else if(mid < num/mid) left = mid + 1;

            else{
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectSq square = new PerfectSq();
        boolean checkPerfectSquare = square.isPerfectSquare(15);
        System.out.println(checkPerfectSquare);
    }
}
