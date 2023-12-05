package Module1.homeWork;

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
        task8();
    }

//    Дан номер месяца — целое число в диапазоне 1–12
//
//            (1 — январь,
//
//            2 — февраль и т. д.).
//
//    Вывести название соответствующего времени года («зима»,«весна», «лето», «осень»).
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        int a = scanner.nextInt();

        switch (a) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }
    }

//    Напишите программу для считывания гендера и печати соответствующего гендера, используя оператор switch
//    Ввод: m
//    Вывод: Мужчина

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваш пол (М/Ж): ");
        int a = scanner.next().charAt(0);

        switch (a) {
            case 'М', 'м' -> System.out.println("Мужчина");
            case 'Ж', 'ж' -> System.out.println("Женщина");
        }
    }

    //Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.
    public static void task3() {
    {
        int year, month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        year = sc.nextInt();
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.print("Number of days is 31");
        else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
        {
            System.out.print("Number of days is 29");
        }
        else if(month == 2)
        {
            System.out.print("Number of days is 28");
        }
        else
            System.out.println("Number of days is 30");
    }
    }

//    Арифметические действия над числами пронумерованы следующим
//    образом:
//            1 — сложение,
//            2 — вычитание,
//            3 — умножение,
//            4 — деление.
//    Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0). Выполнить над числами указанное действие и вывести результат.

    public static void task4() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("A = ");
        int A = Scan.nextInt();
        System.out.print("B = ");
        int B = Scan.nextInt();
        System.out.print("N = ");
        int N = Scan.nextInt();
        double R = 0;

        switch (N) {
            case 1: R = A+B;
                break;
            case 2: R = A-B;
                break;
            case 3: R = A*B;
                break;
            case 4: R = A/B;
                break;
        }
        System.out.println(R);
    }

//    Единицы длины пронумерованы следующим образом:
//            1 — дециметр,
//            2 — километр,
//            3 — метр,
//            4 — миллиметр,
//            5 — сантиметр.
//    Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в этих единицах (вещественное число). Найти длину отрезка в метрах.
    public static void task5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину отрезка: ");
        double d = input.nextDouble();
        System.out.println("Введите номер единицы длины: ");
        int n;
        n = input.nextInt();
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
                System.out.print("метр");
                System.out.print("Найди длину отрезка в метрах");
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
    
    public static void task6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Единицы измерения:\n 1 — килограмм\n 2 — миллиграмм\n 3 — грамм\n 4 — тонна\n 5 — центнер");

        System.out.println("Ваш выбор: ");
        int unit = input.nextInt();

        System.out.println("Введите вес: ");
        double weight = input.nextDouble();

        switch (unit)
        {
            case 1:
                System.out.println("Вес составляет: " + weight * 1.0 + " кг.");
                break;
            case 2:
                System.out.println(weight + " мг в перещете составляет: " + weight * 0.000001 + " кг.");
                break;
            case 3:
                System.out.println(weight + " г в перещете составляет: " + weight * 0.001 + " кг.");
                break;
            case 4:
                System.out.println(weight + " т в перещете составляет: " + weight * 1000.0 + "кг.");
                break;
            case 5:
                System.out.println(weight + " ц в перещете составляет: " + weight * 100.0 + "кг.");
                break;
            default:
                System.out.println("Мера веса с номером " + unit + " отсутствует.");
                break;
        }

    }

    public static void task7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер элемента (1 - радиус, 2 - диаметр, 3 - длина, 4 - площадь):");
        int num = input.nextInt();// Считываем номер элемента
        System.out.println("Введите значение элемента:");
        double val = input.nextDouble(); // Считываем значение элемента

        switch (num)
        {
            case 1: // Если известен радиус
                double diameter = val * 2; // Вычисляем диаметр
                double length = val * 2 * Math.PI; // Вычисляем длину
                double area = Math.PI * val * val; // Вычисляем площадь
                System.out.println("Диаметр: " + diameter);
                System.out.println("Длина: " + length);
                System.out.println("Площадь: " + area);
                break;
            case 2: // Если известен диаметр
                double radius = val / 2; // Вычисляем радиус
                length = val * Math.PI; // Вычисляем длину
                area = Math.PI * radius * radius; // Вычисляем площадь
                System.out.println("Радиус: " + radius);
                System.out.println("Длина: " + length);
                System.out.println("Площадь: " + area);
                break;
            case 3: // Если известна длина
                radius = val / (2 * Math.PI); // Вычисляем радиус
                diameter = radius * 2; // Вычисляем диаметр
                area = Math.PI * radius * radius; // Вычисляем площадь
                System.out.println("Радиус: " + radius);
                System.out.println("Диаметр: " + diameter);
                System.out.println("Площадь: " + area);
                break;
            case 4: // Если известна площадь
                radius = Math.sqrt(val / Math.PI); // Вычисляем радиус
                diameter = radius * 2; // Вычисляем диаметр
                length = diameter * Math.PI; // Вычисляем длину
                System.out.println("Радиус: " + radius);
                System.out.println("Диаметр: " + diameter);
                System.out.println("Длина: " + length);
                break;
            default:
                System.out.println("Некорректный номер элемента!");
                break;
        }
    }

    public static void task8() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите номер элемента (1, 2, 3 или 4): ");
            int elementNumber = scanner.nextInt();

            System.out.println("Введите значение элемента: ");
            double elementValue = scanner.nextDouble();

            double a, c, h, S;

            switch (elementNumber) {
                case 1:
                    // Если известен катет a
                    a = elementValue;
                    c = a * Math.sqrt(2);
                    h = a * Math.sqrt(2) / 2;
                    S = a * a / 2;
                    break;

                case 2:
                    // Если известна гипотенуза c
                    c = elementValue;
                    a = c / Math.sqrt(2);
                    h = c / 2;
                    S = a * a / 2;
                    break;

                case 3:
                    // Если известна высота h
                    h = elementValue;
                    c = h * 2;
                    a = c / Math.sqrt(2);
                    S = a * a / 2;
                    break;

                case 4:
                    // Если известна площадь S
                    S = elementValue;
                    a = Math.sqrt(2 * S);
                    c = a * Math.sqrt(2);
                    h = a * Math.sqrt(2) / 2;
                    break;

                default:
                    System.out.println("Неверный номер элемента.");
                    return;
            }

            System.out.println("Результаты:");
            System.out.println("Катет a: " + a);
            System.out.println("Гипотенуза c: " + c);
            System.out.println("Высота h: " + h);
            System.out.println("Площадь S: " + S);
        }
    }
