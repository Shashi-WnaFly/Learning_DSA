package DSA;

import java.util.Scanner;
// this is the program based on encription when user input a string is converted into 3 letters ahead an encription password.
public class Encripter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String.");
        String pass = in.next();
        String encrip = "";
        char c;
        int a, i;
        for(i = 0; i<pass.length(); i++){
            c = pass.charAt(i);
            a = (int)c + 3;
            if(a>90 && a<97){
                a = a - 26;
            }
            else if(a>122) {
                a = a - 26;
            }
            if(a>122){
                encrip += (char)a;
            }
            encrip += (char)a;
        }
            System.out.println(encrip);
    }
}
