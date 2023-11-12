package lessonWork;

import java.util.Scanner;

public class Lesson2 {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        int age = 25;
    }

    public static void task2() {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = b - a;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void task3() {
        int a = 8;
        int b = 12;
        int c = a * b;

        System.out.println("Площадь прямоугольника = " + c);
    }

    public static void task4() {
        int a = 32;

        System.out.println(a + " градуса по Фаренгейту = " + (a - 32) * 5 / 9 + " градусов по Цельсию");
    }

    public static   void task5() {
        int a = 3;
        int b = 5;
        int c = 7;
        int d = (a + b + c) / 3;

        System.out.println(d);
    }

    public static void task6() {
        int a = 2;
        int b = 4;
        int c = 6;
        int v = a * b * c;
        int s = 2 * (a * b  + b * c + a * c);

        System.out.println("Объем прямоугольного параллелепипида = " + v);
        System.out.println("Площадь поверхности прямоугольного параллелепипида = " + s);
    }

    public static void task7() {
        int a = 5;
        int b = 10;
        double c = (double) Math.sqrt(Math.pow(a, 2) + Math.sqrt(Math.pow(b, 2)));

        System.out.println(c);


    }

    public static void task8() {
        int a = 0;
        int b = a + 1 - 2;

        System.out.println(b);
    }

    public static void task9() {

    }

    public static void task10() {
        String name = "Zhassulan";
        String surname = "Alipov";

        System.out.println(name + " " + surname);
    }

    public static void task11() {
        int a = 5;
        int b = 10;
        int c = a * b;

        System.out.println(c);
    }

    public static void task12() {
        int iBase = 13;
        int iHeight = 15;
        int iAreaTriangle = (iBase * iHeight) / 2;
        System.out.println(iAreaTriangle);
    }

    public static void task13() {
        int iTanya = 1990;
        int iMichael = 1980;
        int iResult = iTanya - iMichael;

        System.out.println(iResult);
    }

    public static void task14() {
        int iMinutes = 130;
        double iHours = (double) iMinutes / 60;

        System.out.println(iHours);
    }

    public static void task15() {
        String str1 = "Lorem";
        String str2 = "Ipsum";

        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
    }

    public static void task16() {
        System.out.println("Enter a value:");
        int a = scanner.nextInt();
        System.out.println(a);
    }
}