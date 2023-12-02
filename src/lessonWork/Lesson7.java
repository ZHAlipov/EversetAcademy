package lessonWork;

import java.util.Scanner;

public class Lesson7 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //task1
        // Примеры трех треугольников с заданными основаниями и высотами
        double a1 = 8.0, h1 = 6.0;
        double a2 = 10.0, h2 = 4.0;
        double a3 = 12.0, h3 = 8.0;

        // Вычисляем периметры с использованием функции TriangleP
        double perimeter1 = TriangleP(a1, h1);
        double perimeter2 = TriangleP(a2, h2);
        double perimeter3 = TriangleP(a3, h3);

        // Выводим результаты
        System.out.println("Периметр треугольника 1: " + perimeter1);
        System.out.println("Периметр треугольника 2: " + perimeter2);
        System.out.println("Периметр треугольника 3: " + perimeter3);

        //task2
        System.out.print("\nВведите число от 1 до 12: ");
        int a = scanner.nextInt();
        task2(a);

        //task3
        Scanner input = new Scanner(System.in);
        System.out.println("\nВведите длину отрезка: ");
        double a4 = input.nextDouble();
        System.out.println("Введите номер единицы длины: ");
        int b;
        b = input.nextInt();
        task3(a4, b);
    }

    // Функция для нахождения периметра равнобедренного треугольника
    static double TriangleP(double a, double h) {
        // Находим боковую сторону b с использованием теоремы Пифагора
        double b = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(h, 2));

        // Находим периметр треугольника
        double perimeter = 2 * b + a;

        return perimeter;
    }

    static void task2(int num) {

        switch (num) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }
    }

    static void task3(double d, int n) {

        if (n < 1 || n > 5)
        {
            System.out.println("ОШИБКА!");
        }

        switch (n)
        {
            case 1:
                System.out.println("дециметр");
                System.out.println("Найди длину отрезка в метрах");
                System.out.println(d/10);
                break;
            case 2:
                System.out.println("километр");
                System.out.println("Найди длину отрезка в метрах");
                System.out.println(d*1000);
                break;
            case 3:
                System.out.println("метр");
                System.out.println("Найди длину отрезка в метрах");
                System.out.print(d);
                break;
            case 4:
                System.out.println("милиметр");
                System.out.println("Найди длину отрезка в метрах");
                System.out.println(d/1000);
                break;
            case 5:
                System.out.println("сантиметр");
                System.out.println("Найди длину отрезка в метрах");
                System.out.println(d/100);
                break;
        }
    }

}
