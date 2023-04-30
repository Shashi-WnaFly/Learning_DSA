package DSA;

import java.util.Scanner;
// this is the program based on encription when user input a string is converted into 3 letters ahead an encription password.
public class Encripter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String.");
        String pass = in.next();
        String encrip = "";
        char s;
        int a, i;
        for(i = 0; i<pass.length(); i++){
            s = pass.charAt(i);
            a = (int)s + 3;
            if(s>=97 && s<=119){
                encrip += (char)a;
            }
            else if(s>119 && s<=122) {
                a = a - 26;
                encrip += (char) a;
            }
            if(s>122){
                a = (int)s - 26;
                encrip += (char)a;
            }
        }
            System.out.println(encrip);
    }
}
