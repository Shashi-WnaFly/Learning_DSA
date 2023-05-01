package DSA;
import java.util.*;

public class Varargs {
    static void sum(int ...n){
        System.out.println(Arrays.toString(n));
    }
    public static void main(String[] args) {
        sum(11,89,45,12,2,11,111,31,78,19,12);
    }
}
