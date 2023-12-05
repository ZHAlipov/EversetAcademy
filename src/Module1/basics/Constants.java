package Module1.basics;

import java.util.Scanner;

public class Constants {

    public static void main(String[] args) {
        var2();
    }

    public static void var1() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println(num1);
        num1++;
        System.out.println(num1);
    }

    public static void var2() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("num1 = " + num1);
        num1++;
        System.out.println("num1 + 1 = " + num1);
        final int num2 = 10;
        System.out.println("num2 = " + num2);
        System.out.println(num2);
    }
}
