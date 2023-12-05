package Module1.lessonWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Введите размер массива: ");
//        int n = scanner.nextInt();
//        task5(n);
        task6();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void task1(int n) {
        //    Array1. Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера N, содержащий N первых положительных
        //    нечетных чисел: 1, 3, 5, . . . .
        int[] array = new int[n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            array[i] = counter;
            counter += 2;
        }
        printArray(array);
    }

    public static void task3(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void task4(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int sum = 0;

        for (int i = k - 1; i <= l - 1; i++) {
            sum += arr[i];
        }
    }

    public static void task5(int n) {

        int[] a = new int[n];
        int cnt = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Введите значение массива: ");
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                cnt++;
            }

            int[] b = new int[cnt];
            int bSum = 0;

            for (int k = 0; k < cnt; k++) {
                for (int j = 0; j < n; j++) {
                    if (a[j] % 2 == 0) {
                        b[k] = a[j];
                        bSum += b[k];
                    }
                }
            }

            printArray(b);
            System.out.println("Сумма чисел массива В: ");

        }

    }

    //заполить рандомно только элементы четных столбцов
    public static void task6() {
        Random random = new Random();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i+= 2) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=random.nextInt(5, 30);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }


}

//    Array47*. Дан целочисленный массив размера N. Найти количество различных элементов в данном массиве.