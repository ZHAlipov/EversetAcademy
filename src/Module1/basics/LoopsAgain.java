package Module1.basics;

import java.util.Scanner;

public class LoopsAgain {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("Enter width: ");
//        int width = scanner.nextInt();
//        System.out.println("Enter length: ");
//        int length = scanner.nextInt();
//        nestedLoop(width, length);
//        for1();
//        System.out.println("Введите число K: ");
//        int K = scanner.nextInt();
//        System.out.println("Введите число N: ");
//        int N = scanner.nextInt();
//        for1(K, N);
        //for2();
        System.out.print("Введите число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int B = scanner.nextInt();
//        for2(A, B);
        for3(A, B);
    }

    public static void sumStreamSample() {
        System.out.println("Enter stream length: ");
        int length = scanner.nextInt();
        System.out.println("Stream sums = " + sumIntegerStreamError1(length));
    }

    public static int sumIntegerStream(int streamLength) {
        int sum = 0;
        for (int i = 0; i < streamLength; i++) {
            System.out.println("Enter " + i + " integer:");
            sum += scanner.nextInt();
        }
        return sum;
    }

    public static int sumIntegerStreamError1(int streamLength) {
        int sum = 0;
        for (int i = 0; i < streamLength; i++) {
            System.out.println("Enter " + (i+1) + " integer:");
            int a = scanner.nextInt();
            sum += a;
        }
        return sum;
    }

    public static void nestedLoop(int x, int y) {
        System.out.println("Print square of sizes " + x + " on " + y);
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //for1 Даны целые числа K и N (N>0). Вывести N раз число K
    public static void for1(int K, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(K);
        }
    }

    public static void for2(int A, int B) {
        for (int i = A; i <= B; i++) {
            System.out.println(i);
        }
        int N = B - A + 1;
        System.out.println("N = " + N);
    }

    public static void for3(int A, int B) {
        int count = 0;
        for (int i = B - 1; i > A; i--) {
            System.out.println(i);
            count ++;
        }

        System.out.println("\n" + count);
    }
}


