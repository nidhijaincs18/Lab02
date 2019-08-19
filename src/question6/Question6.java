package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alpha1 = scanner.nextLine().charAt(0);
        char alpha2 = scanner.nextLine().charAt(0);
        if (alpha1 < alpha2) {
            System.out.println(alpha1 + " " + alpha2);
        } else {
            System.out.println(alpha2 + " " + alpha1);
        }
        scanner.close();
    }
}
