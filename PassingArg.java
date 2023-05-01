package DSA;
import java.util.*;
public class PassingArg {
    static int a, b, temp;
    public static void main(String[] args) {
        String[] leader = {"Martin", "Obama", "Stephen"};
        changeIVal(leader);
        System.out.println(Arrays.toString(leader));
        a = 15; b = 30;
        swap();
        System.out.println(a+" "+b);
    }
    static void swap() {
        temp = a;
        a = b;
        b = temp;
    }
    static void changeIVal(String[] neta) {
            neta[0] = "Gandhi";
    }
}
