package Module1.lessonWork;

import java.util.Scanner;

public class Lesson3 {

    public static Scanner scanner = new Scanner(System.in);

    // one line comment
    // main метод это главный метод, который в Java используется для запуска программ
    public static void main(String[] args) {
        checkTask3();
    }

    public static void integer17() {
        int integerValue = scanner.nextInt();
        System.out.println("int val: " + integerValue);
    }

    public static void integer18() {
        boolean trueOrFalse = scanner.nextBoolean();
        System.out.println("boolean val: " + trueOrFalse);
    }

    public static void integer19() {
        String next = scanner.next();
        String string = scanner.nextLine();
        System.out.println("Full line: " + string);
    }

    public static void nextSample() {
        String next = scanner.next();
        System.out.println(next);
    }

    public static void integer20() {
        System.out.println("Input number more than 999: ");
        int number = 1;
        while (number <= 999) {
        System.out.println("Введите число");
        number = scanner.nextInt();
        }
        int hundreds = number % 1000;
        System.out.println("hundreds " + hundreds);
        int digit = hundreds / 100;
        System.out.println("answer: " + digit);
    }

    public static void if24() {
        double x = scanner.nextDouble();
        //Math.pow() - возведение в степень
        //Math.abs() - модуль
        //Math.sqrt() - квадратный корень
        if( x > 0) {
            System.out.println(2 * Math.sin(x));
        } else {
            System.out.println(6 - x);
        }
    }

    public static void usingConstants() {
        int r = scanner.nextInt();
        double L = 2 * r * Math.PI;
        double S = Math.PI * Math.pow(r, 2);
    }

    //Дано трехзначное число. Проверить истинность высказывания: «Все цифры данного числа различны».
    public static void checkTask1() {

        int number = 1;
        while (number < 100) {
            System.out.print("Введите трехзначное число: ");
            number = scanner.nextInt();
        }
        int x = number % 100 / 10;
        int y = number % 10;
        int z = number / 100;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if (x != y && y != z) {
            System.out.println("Все цифры данного числа различны");
        } else {
            System.out.println("Имеются совпадения в цифрах");
        }
    }

    //Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника. Проверить истинность высказывания: «Треугольник со сторонами a, b, c является равнобедренным».
    public static void checkTask2() {
        System.out.println("Введите 1 сторону треугольника");
        int a = scanner.nextInt();
        System.out.println("Введите 2 сторону треугольника");
        int b = scanner.nextInt();
        System.out.println("Введите 3 сторону треугольника");
        int c = scanner.nextInt();

        if (a==b && b==c) {
            System.out.println("Треугольник не равнобедренный");
        } else if ((a==b) || (b==c) || (c==a)) {
            System.out.println("Треугольник является равнобедренным");
        } else {
            System.out.println("Треугольник не равнобедренный");
        }
    }

    //Даны координаты двух различных полей шахматной доски x1,
    //y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность
    //высказывания: «Слон за один ход может перейти с одного поля на другое».
    public static void checkTask3() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 6;
        int y2 = 6;

        boolean canBishopMove = Math.abs(x1 - x2) == Math.abs(y1 - y2);
        System.out.println("Слон может перейти с одного поля на другое за один ход: " + canBishopMove);
    }
}
