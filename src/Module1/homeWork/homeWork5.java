package Module1.homeWork;

import java.util.Scanner;

public class homeWork5 {

        public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            //task1
//            System.out.println("Можете что нибудь написать: ");
//            String text = scanner.nextLine();
//            task1(text);
            //task2
//            System.out.println("Enter a value a:");
//            int a = scanner.nextInt();
//            System.out.println("Enter a value b:");
//            int b = scanner.nextInt();
//            System.out.println("Enter a value c:");
//            int c = scanner.nextInt();
//            task2(a, b, c);
//            //task3
//            System.out.print("Введите позитивное или отрицательное число: ");
//            int number = scanner.nextInt();
//            task3(number);
//            //task4
//            System.out.print("Введите число для возведения в квадрат: ");
//            int number1 = scanner.nextInt();
//            int result = task4(number1);
//            System.out.println(result);
//            //task5
//            System.out.print("Введите число 1 = ");
//            double a = scanner.nextInt();
//            System.out.print("Введите число 2 = ");
//            double b = scanner.nextInt();
//            System.out.print("Введите математический оператор (+, -, *, /): ");
//            char n = scanner.next().charAt(0);
//            double result1 = task5(a, b, (char) n);
//            System.out.println(result1);
            //task6
//            System.out.print("Введите число 1 = ");
//            int a1 = scanner.nextInt();
//            System.out.print("Введите число 2 = ");
//            int b1 = scanner.nextInt();
//            System.out.print("Введите число 3 = ");
//            int c1 = scanner.nextInt();
//            int result2 = task6(a1, b1, c1);
//            System.out.println(result2);
            //task7
//            System.out.println("Enter the string");
//            String word=scanner.next();
//            task7(word);
//            scanner.close();
            //task8
            System.out.print("Введите 3-значное число: ");
            int number2 = scanner.nextInt();
            int sum = task8(number2);
            System.out.println("Сумма цифр числа " + number2 + " равна: " + sum);
        }

//**Exercise 1:**
//Write a method that read an input from a user
         static void task1(String text) {
            System.out.println(text);
        }

//**Exercise 2:**
//    Write a Java method to find the smallest number among three
//    entered numbers.
        static void task2(int a, int b, int c) {
            if ((a <= b) && (a <= c)) {
                System.out.println("a is the minimum value between others");
            } else if ((b <= a) && (b <= c)) {
                System.out.println("b is the minimum value between others");
            } else {
                System.out.println("c is the minimum value between others");
            }
        }

    //**Exercise 3:**
//    Write a Java method that check if the entered number is
//    negative or positive or zero.
    static void task3(int number) {

        if (number > 0) {
            System.out.println("Число " + number + " является положительным");
        } else if (number < 0) {
            System.out.println("Число " + number + " является отрицательным");
        } else {
            System.out.println("Введено число 0");
        }
    }

//**Exercise 4**:
//    Write a method for squaring a number.
        static int task4(int a) {
            int result = a * a;
            return result;
        }

//**Exercise 5**:
//    Write a console calculator method. (operations: +, - , * , / )
//            **Input:**
//    Enter the number: 3
//    Enter the number: 6
//    Enter the operation: *
//            **Output:**
//    Total: 3 * 6 = 18

        static double task5(double number1, double number2, char operation) {

            return switch (operation) {
                case '+' -> number1 + number2;
                case '-' -> number1 - number2;
                case '*' -> number1 * number2;
                case '/' -> (double) number1 / number2;
                default -> 0;
            };
        }



//**Exercise 6:**
//    Write a Java method to compute the average of three numbers
        static int task6(int a, int b, int c) {
            int result = (a + b + c) / 3;
            return result;
        }
//**Exercise 7:**
//Write a Java method to display the middle character of a string.
        static void task7(String str) {
            int length = str.length();
            int middleIndex = length / 2;

            if (length % 2 == 0) {
                // Если длина строки четная, отобразить два средних символа
                System.out.println("Средние символы: " + str.charAt(middleIndex - 1) + str.charAt(middleIndex));
            } else {
                // Если длина строки нечетная, отобразить один средний символ
                System.out.println("Средний символ: " + str.charAt(middleIndex));
            }
        }

        //**Exercise 8:**Напишите метод Java для вычисления суммы цифр целого числа.
        static int task8(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    }


