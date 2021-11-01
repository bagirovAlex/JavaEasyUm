package lesson_04;

import java.util.Scanner;

public class JavaRush3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        boolean twoInt0 = (a == b && b == c);
        boolean twoInt1 = a == b;
        boolean twoInt2 = a == c;
        boolean twoInt3 = c == b;

        if (twoInt0) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (twoInt1) {
            System.out.println(a);
            System.out.println(b);
        } else if (twoInt2) {
            System.out.println(a);
            System.out.println(c);
        } else if (twoInt3) {
            System.out.println(c);
            System.out.println(b);
        }
    }
}
