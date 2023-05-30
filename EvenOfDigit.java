package DSA;

//Find Numbers with Even Number of Digits
public class EvenOfDigit {
    public static int findNumbers(int[] nums) {
        int count = 0, ev = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                nums[i] /= 10;
                count++;
            }
//            ev += count%2;
            if (count % 2 == 0) ev++;

        }
//        ev = nums.length-ev;
        System.gc();
        return ev;
    }

    public static void main(String[] args) {
        int[] mat = {13, 133, 245, 1, 45};
        int r = findNumbers(mat);
        System.out.println(r);
    }
}
