package homeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork6 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //cWTask
//        System.out.print("Введите число А: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите число B: ");
//        int b = scanner.nextInt();
//        int result = Sign(a) + Sign(b);
//        System.out.println(result);
        //task1
//        task2();
        //task3
//        System.out.print("Введите число, для которого нужно найти факториал: ");
//        int number = scanner.nextInt();
//        int factorial = calculateFactorial(number);
//        System.out.println("Факториал числа " + number + " равен: " + factorial);
//        task4();
//        task5();
        task6();
    }

//    Описать функцию Sign(X) целого типа, возвращающую для вещественного числа X следующие значения:
//    −1, если X < 0; 0, если X = 0; 1, если X > 0.
//    С помощью этой функции найти значение выражения Sign(A) + Sign(B) для данных вещественных чисел A и B.

    static int Sign(int x) {
        if (x<0) {
            return -1;
        } else if (x==0) {
            return 0;
        } else {
            return 1;
        }
    }




//  Exercise 1: calculate the sum of 10 numbers
//  Запросить у пользователя фиксированное количество чисел. Сумма зафиксирована в тексте упражнения: она равна 10.
//  Когда пользователь закончит вводить 10 чисел, посчитайте и распечатайте сумму.
    static void task1() {
        int sum = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Введите число:");
            int number = scanner.nextInt();
            sum += number;

        }

        System.out.println("Общая сумма: " + sum);

    }
//            Exercise 2: calculate the sum of N numbers
//    Попросите пользователя указать фиксированное количество чисел. Сумма фиксирована, но определяется пользователем до того, как он начнет вводить цифры. Мы запрашиваем у пользователя количество чисел, которые он планирует ввести, и называем это N. Когда пользователь заканчивает вводить N чисел, вычисляем и печатаем сумму.
static void task2() {
    System.out.print("Введите кол-во запросов: ");
    int N = scanner.nextInt();
    int sum = 0;


    for (int i = 0; i < N; i++) {
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        sum += number;

    }

    System.out.println("Общая сумма: " + sum);

}

    //            Exercises 3: Find the factorial of a given number.
static int calculateFactorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * calculateFactorial(n -1);
    }
}


//            Exercise 4:
//            1.	Print out Hello World 3 times
//2.	Use a loop to print the numbers from 1 to 10
//            3.	Use a loop to print a * 10 times
//4.	Use a loop to print the numbers starting from 5 to -5
//            5.	Use a loop to print every third number from 5 to 30
//    Try using both a for loop and a while loop
    static void task4() {
        int i = 0;
        while (i < 3) {
            System.out.println("Hello world");
            i++;
        }

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        int a = 2;
        int sum;

        do  {
            sum = a * 10;
            System.out.println(sum);
            a++;
        }
        while (sum < 1000);
    }
//    Exercise 5:
//    Write a method that prints out the statement
//    I am now printing for the [Number of iteration]th time
//    Run 10 iterations

    static void task5() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am now printing for the " + i + "th time");
        }
    }
//    Exercise 6:
//    Prints a random number of hashtags (#) (Maximum 10)
    static void task6() {
        Random random = new Random();
        int numberOfHashtags = random.nextInt(10)+1;
        for (int i = 0; i < numberOfHashtags; i++) {
            System.out.print("#");
        }
    }

}
