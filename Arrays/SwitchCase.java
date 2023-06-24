package Learning_DSA.Arrays;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the client name");
        String idName = in.next();
        switch (idName) {
            case "shashi" -> {
                System.out.println("His full name is the Shashi Anand.");
            }
            case "rakesh" -> {
                System.out.println("His full name is the Rakesh panvel");
            }
            case "kushwaha" -> {
                System.out.println("His full name is the Kunal kushwaha.");
            }
            case "department" -> {
                System.out.println("Enter department number please.");
                int dep = in.nextInt();
                switch (dep) {
                    case 1 -> {
                        System.out.println("B-Tech department");
                    }
                    case 2 -> {
                        System.out.println("civil department.");
                    }
                    case 3 -> {
                        System.out.println("Mechanic department.");
                    }
                    default -> {
                        System.out.println("Invalid input.");
                    }
                }
            }
            default -> {
                System.out.println("Invalid input.");
            }
        }
    }
}
