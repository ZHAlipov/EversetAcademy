package homeWork;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
//        helloWorld();
//        sum();
//        div();
//        les4();
//        les5();
//        les6();
//        les7();
//        les8();
//        les9();
        les10();


    }

    private static void helloWorld() {
        System.out.println("lesson 1\nHello\nZhassulan Alipov");
    }

    private static void sum() {
        int a = 74;
        int b = 36;
        int sum = a + b;

        System.out.println("\nlesson 2\n" + sum);
    }

    private static void div() {
        int a = 50;
        int b = 3;
        int div = a / b;

        System.out.println("\nlesson 3\n" + div);
    }

    private static void les4() {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("\nlesson 4");
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }

    private static void les5() {

        Scanner in = new Scanner(System.in);
        System.out.println("\nlesson 5");
        System.out.println("Input first number: ");
        int numOne = in.nextInt();
        System.out.println("Input second number: ");
        int numTwo = in.nextInt();
        int mul = numOne * numTwo;

        System.out.println(numOne + " * " + numTwo + " = " + mul);
        in.close();
    }

    private static void les6() {

        Scanner in = new Scanner(System.in);
        System.out.println("\nlesson 6");
        System.out.println("Input first number: ");
        int a = in.nextInt();
        System.out.println("Input second number: ");
        int b = in.nextInt();
        int sum = a + b;
        int subs = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + subs);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + mod);
        in.close();
    }

    private static void les7() {

        Scanner in = new Scanner(System.in);
        System.out.println("\nlesson 7");
        System.out.println("Input number: ");
        int a = in.nextInt();
        int x1 = a * 1;
        int x2 = a * 2;
        int x3 = a * 3;
        int x4 = a * 4;
        int x5 = a * 5;
        int x6 = a * 6;
        int x7 = a * 7;
        int x8 = a * 8;
        int x9 = a * 9;
        int x10 = a * 10;
        System.out.println(a + " * " + "1" + " = " + x1);
        System.out.println(a + " * " + "2" + " = " + x2);
        System.out.println(a + " * " + "3" + " = " + x3);
        System.out.println(a + " * " + "4" + " = " + x4);
        System.out.println(a + " * " + "5" + " = " + x5);
        System.out.println(a + " * " + "6" + " = " + x6);
        System.out.println(a + " * " + "7" + " = " + x7);
        System.out.println(a + " * " + "8" + " = " + x8);
        System.out.println(a + " * " + "9" + " = " + x9);
        System.out.println(a + " * " + "10" + " = " + x10);

        in.close();
    }

    private static void les8() {
        System.out.println("\nlesson 8");
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    private static void les9() {
        double a =  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        System.out.println("\nlesson 9");
        System.out.println(a);
    }

    private static void les10() {
        double a =  4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));

        System.out.println("\nlesson 10");
        System.out.println(a);
    }
}