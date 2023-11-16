package basics;

import java.util.Scanner;

public class MethodsNextLevel {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        boolean result = compareReversed(num);
        System.out.println("Is reversed number equal? " + result);
    }

    static boolean compareReversed(int number) {
        int firstDigit = number / 10000;
        int secondDigit = number / 1000 % 10;
        int thirdDigit = number / 100 % 10;
        int fourthDigit = number / 10 % 10;
        int fifthDigit = number % 10;
//        System.out.println(firstDigit);
//        System.out.println(secondDigit);
//        System.out.println(thirdDigit);
//        System.out.println(fourthDigit);
//        System.out.println(fifthDigit);

        int reversedNumber = fifthDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println("Reversed number is: " + reversedNumber);
        return reversedNumber == number;
    }
}
